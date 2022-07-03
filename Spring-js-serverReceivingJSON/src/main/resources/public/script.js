function takeData() {
    let name = document.getElementById("nombre").value;
    let emailS = document.getElementById("email").value;
    let passwordS = document.getElementById("password").value;

    const data = {
        username: name,
        email: emailS,
        password: passwordS
    }
    console.log(JSON.stringify(data));
    return data;
}

function sendDataPost() {
    let payload = takeData();
    console.log(JSON.stringify(payload));

    //NO USAR EL FORM DATA A MENOS QUE SEA UN OBJETO MUY COMPLEJO. 
    fetch("api/response", {
        headers: {
            'Host': 'localhost:8080',
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify(payload)
    }).then(res => { console.log("res is: " + JSON.stringify(res)) })
        .catch(error => { console.log(error) })
}

document.getElementById("submit").addEventListener('click', sendDataPost);