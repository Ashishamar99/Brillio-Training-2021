async function getDept(){
    fetch("http://localhost:3000/dept").then((res)=>{
        return res.json();
    }).then((dept)=>{
        console.log(dept);
    })
}