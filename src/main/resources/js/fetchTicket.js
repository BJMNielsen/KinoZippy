console.log("vi er i fetchkommuner")
const urlPostKommune = "http://localhost:8080/ticket"

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

let lstTickets = []

async function actionFetchTickets() {
    lstTickets = await fetchAny(urlTickets);
    console.log(lstTickets)
    //lstTickets.forEach(fillKommuneDropDown)
}

function fillKommuneDropDown(kommune) {
    //console.log(kom)
    const el = document.createElement("option")
    el.textContent = kommune.navn
    el.value = kommune.kode
    el.region = kommune
    ddKommuner.appendChild(el)
}

let body = {}

const postKommuneRequest = {
    method: "POST",
    headers: {
        "content-type": "application/json"
    },
    body: body
}

function postKommune(kommune) {
    body = JSON.stringify(kommune)
    console.log(body)
    postKommuneRequest.body = body;
    fetch(urlPostKommune, postKommuneRequest).catch((error) => console.log(error));
}

function actionPostAllKommuner(bth) {
    console.log("post alle regioner");
    lstTickets.forEach(postKommune)
}


const pbFetchKommuner = document.getElementById("pbFetchKommuner")
const pbPostKommuner = document.getElementById("pbPostKommuner")
pbFetchKommuner.addEventListener('click', actionFetchKommuner)
pbPostKommuner.addEventListener('click', actionPostAllKommuner)

