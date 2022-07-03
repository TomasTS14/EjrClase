


let form = document.getElementById('form');

let botonSubmit = document.querySelector('input[type="submit"]');
let textArea = document.querySelector('textarea');

const takeSubmit = () => {
    let nombreString = document.getElementById('nombre').value;
    let apellidoString = document.getElementById('apellido').value;
    let emailString = document.getElementById('email').value;


    const user = {
        nombre: nombreString,
        apellido: apellidoString,
        email: emailString
    };
    console.log(JSON.stringify(user));

    return user;
}

const sendPostRequest = () => {

    let payload = takeSubmit();

    // let data = new FormData();
    // data.append("json", payload);

    fetch("api/app_user",
        {
            headers: {
                'Host': 'localhost:8080',
                'Accept': 'application/json',
                'Content-type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(payload)
        })
        .then(function (res) { console.log(res); })
        .catch(function (error) { console.log(error) })

    console.log(payload);
    // const newUser = takeSubmit();
    // let requestBody = JSON.stringify(newUser);
    // const http = new XMLHttpRequest();
    // http.open('POST', "http://localhost:8080/api/app_user", true);
    // http.responseType = 'json';
    // http.send(requestBody);
    // console.log(requestBody);
}
const getUsersRequest = () => {
    // let response;
    // const http = new XMLHttpRequest();
    // http.open('GET', "http://localhost:8080/api/app_user", true);
    // http.responseType = 'json';
    // http.send();
    // response = http.response;
    // return JSON.stringify(response);
}

const writeUsersOntxtArea = () => {
    let response = getUsersRequest();
    textArea.textContent = response;
}

botonSubmit.addEventListener('click', sendPostRequest);
botonSubmit.addEventListener('click', writeUsersOntxtArea);

(function () {
    textArea.textContent = getUsersRequest();
    if (typeof browser === "undefined") {
        let browser = chrome;
    }
})(); 