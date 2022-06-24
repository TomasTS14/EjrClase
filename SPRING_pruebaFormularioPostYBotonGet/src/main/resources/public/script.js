


let form = document.getElementById('form');

let botonSubmit = document.querySelector('button[type="submit"]');
let textArea = document.querySelector('textarea');

const takeSubmit = () => {
    let nombre = document.getElementById('nombre').textContent;
    let apellido = document.getElementById('apellido').textContent;
    let email = document.getElementById('email').textContent;

    const user = {
        nombre: `${nombre}`,
        apellido: `${apellido}`,
        email: `${email}`
    };

    return user;
}

const sendPostRequest = () => {

    var payload = takeSubmit();

    var data = new FormData();
    data.append("json", JSON.stringify(payload));

    fetch("api/app_user",
        {
            method: "POST",
            body: data
        })
        .then(function (res) { console.log(res); return JSON.stringify(data); })
        .then(function (data) { alert(JSON.stringify(data)) })
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
        var browser = chrome;
    }
})(); 