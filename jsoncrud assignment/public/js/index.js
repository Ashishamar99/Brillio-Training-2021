var url = "http://localhost:3000/schoolRecords";
var fetchedID = NaN;

function displayRecords(){

    fetch(url).then((response)=>{
        return response.json();
    }).then((studentRecords)=>{
        console.table(studentRecords);

        let tableHead = `<table class="displayTable table table-dark table-striped">
        <thead>
        <tr>
            <th>
            <span scope="col">
                Student ID
            </span>
            </th>
            <th>
                <span scope="col">
                    Student USN 
                </span>
            </th>
            <th>
            <span scope="col">
                Student Name 
            </span>
            </th>
            <th>
            <span scope="col">
                Department 
            </span>
            </th>
        </tr>
        </thead>`;

    let tableEnd = `</tbody>
    </table>`;

    let tableBody = `<tbody>`;

        // $(".displayModalID").append(tableHead);

        for(var index in studentRecords) {
            tableBody += `<tr>`;
            for(var key in studentRecords[index]){
                tableBody += `<td>`;
                tableBody += `${studentRecords[index][key]}
                </td>`;
            }
            tableBody += `</tr>`;
        }

        let completeTable = tableHead + tableBody + tableEnd;
        $(".displayModalID").append(completeTable);
    })
}

function getRecordById(id, updateOrDelete){
    newurl = url + `/${id}`;
    fetchedID = id;

    if (updateOrDelete == "Update"){

        fetch(newurl).then((response)=>{
                return response.json();
                }).then((student)=>{
                console.table(student);

                // Populate the form values
                document.getElementById("usnfield").value = student.usn;
                document.getElementById("namefield").value = student.sname;
                document.getElementById("deptfield").value = student.dept;

        })
    }

    else{
        fetch(newurl, {
        method: "DELETE",
        headers:{
            'Content-Type':'application/json' 
        },
        }).then((response) => {
        console.warn(response);
        return response.json();
    })
    window.location.reload();
    }
}

function updateChoiceLabel(){
    isChecked = document.getElementById("actionForUpdateDelete").checked;
    labeltext = document.getElementById("actionLabelForUpdateDelete");
    
    if(isChecked){
        labeltext.innerHTML = 'Update';
    }
    else{
        labeltext.innerHTML = 'Delete';
    }
}


function updateLabel(){
    isChecked = document.getElementById("actioncheck").checked;
    labeltext = document.getElementById("actionLabel");
    if(isChecked){
        labeltext.innerHTML = 'Create';
    }
    else{
        labeltext.innerHTML = 'Update';
    }
}

async function checkActionAndExecute(){

    labeltext = document.getElementById("actionLabel").innerHTML;

    inputUsn = Number(document.getElementById("usnfield").value);
    inputName = document.getElementById("namefield").value;
    inputDept = document.getElementById("deptfield").value;

    if(labeltext == 'Create'){
        addStudent(inputUsn, inputName, inputDept);
    }
    else{
        updateStudent(inputUsn, inputName, inputDept);
    }
}

function addStudent(usn, name, dept){

    var newStudent = {
        "id": NaN,
        "usn": usn,
        "sname": name,
        "dept": dept
    }

    console.log(newStudent);

    fetch(url, {
                method: "POST",
                body: JSON.stringify(newStudent),
                headers:{
                    'Content-Type':'application/json' 
                },
            }).then((response) => {
                console.warn(response);
                return response.json();
            }).then((returnresult) => {
                console.log(returnresult);
            })

            window.location.reload();

}

function updateStudent(usn, name, dept){

    var newStudent = {
        "id": NaN,
        "usn": usn,
        "sname": name,
        "dept": dept
    }

    fetch(newurl, {
                method: "PUT",
                body: JSON.stringify(newStudent),
                headers:{
                    'Content-Type':'application/json' 
                },
            }).then((response) => {
                console.warn(response);
                return response.json();
            }).then((returnresult) => {
                console.log(returnresult);
            })

            window.location.reload();

}