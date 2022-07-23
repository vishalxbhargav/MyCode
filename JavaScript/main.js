//Async js Programming
//Callbacks

const data=[
    {name:"nekken",profession:"technician"},
    {name :"hawana",profession:"worker"}
];

function getDatas(){
    
    setTimeout(() => {
        let output="";
        datas.forEach((data,index)=>{
            output+='<li>${index.name}</li>';

        })
        document.body.innerHTML=output
    },100);
}

getDatas();

