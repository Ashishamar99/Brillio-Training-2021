var url = "http://localhost:3000/dept";

async function getDept(){
    fetch(url).then((response)=>{
        return response.json();
    
    }).then((dept)=>{

        console.table(dept);
    
    })

}

async function addDept(){

    /******************************************************** 
    NOTE - HEADER TYPE IS A MUST WHEN MAKING A FETCH REQUEST!
    ********************************************************/ 
    
    var id = Number(prompt("Enter ID"));
    var dname = prompt("Enter Department Name");
    var loc = prompt("Enter Location");

    var newRecord = {
        "id": id,
        "dname": dname,
        "loc": loc
    }

    console.log(newRecord);

    fetch(url, {
        method: "POST",
        body: JSON.stringify(newRecord),
        headers:{
            'Content-Type':'application/json' 
        },
    }).then((response) => {
        console.warn(response);
        return response.json();
    }).then((returnresult) => {
        console.log(returnresult);
    })
}

async function updateDept(){
    var id = Number(prompt("Enter Modified ID"));
    var dname = prompt("Enter Modified Department Name");
    var loc = prompt("Enter Modified Location");

    var newRecord = {
        "id": id,
        "dname": dname,
        "loc": loc
    }

    newurl = url;
    newurl += `/${id}`;

    fetch(newurl, {
        method: "PUT",
        body: JSON.stringify(newRecord),
        headers:{
            'Content-Type':'application/json' 
        },
    }).then((response) => {
        console.warn(response);
        return response.json();
    })

}

async function deleteDept(){

    var id = Number(prompt("Enter The ID of the record to be deleted."));

    newurl = url;
    newurl += `/${id}`;

    fetch(newurl, {
        method: "DELETE",
        headers:{
            'Content-Type':'application/json' 
        },
    }).then((response) => {
        console.warn(response);
        return response.json();
    })

}