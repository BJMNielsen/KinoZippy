console.log("vi er i fetchkommuner")
const urlTicket = "http://localhost:8080/ticket"

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

let lstTickets = []

async function actionFetchTickets() {
    lstTickets = await fetchAny(urlTicket);
    console.log(lstTickets)
    //lstTickets.forEach(fillKommuneDropDown)
}


async function createTicketTable() {
    const products = await fetchAny(urlTicket)
    console.log(products)
    const tableRowsData = products.map(product => `
    <tr>
      <td>${product.ticketId}</td>
      <td>${product.seatValue}</td>
      <td>${product.showing}</td>
    </tr>`)

    let tableAsString = tableRowsData.join("\n")
    console.log(tableAsString)
    document.getElementById("productTable").innerHTML = tableAsString


}


/*
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
*/
