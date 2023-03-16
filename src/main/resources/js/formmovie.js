console.log("Vi er i formmovie")

document.addEventListener('DOMContentLoaded', createFormEventListener);
let formMovie;

function createFormEventListener(){
    formMovie = document.getElementById("formMovie");
    formMovie.addEventListener("submit", handleFormSubmit);
}

async function handleFormSubmit(event) {
    //Vi handler submit her, i stedet for default html behaviour
    event.preventDefault();
    const form = event.currentTarget;
    const url = form.action;
    console.log(form)
    console.log(url)
    console.log(form === formMovie)
    try {
        const formData = new FormData(form)
        console.log(formData)
        const responseData = await postFormData(url, formData)

        alert(formData.get('navn') + ' er oprettet');

        const homeUrl = "homepage.html";
        window.location.replace(homeUrl); //man kan ikke gøre det her indeni en submit button
        //window.location.href = homeUrl;


    } catch (error) {
        alert(error.message)
        console.log(error)
    }
}

async function postFormData(url, formData) {
    const plainFormData = Object.fromEntries(formData.entries())
    //Ved ikke havd der skal stå her
    //const ix = ddRegioner.selectedIndex;
    //const linje = ddRegioner[ix]
    //plainFormData.region = linje.region
    console.log(plainFormData)
    const formDataJsonString = JSON.stringify(plainFormData)
    const fetchOptions = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: formDataJsonString
    }

    const response = await fetch(url, fetchOptions)

    if (!response.ok) {
        const errorMessage = await response.text()
        throw new Error(errorMessage)
    }
    return response.json();

}
//Ved ikke havd der skal stå her
//const ddRegioner = document.getElementById("ddRegioner")
/*
function fillRegionerDropDown(region) {
    //console.log(kom)
    const el = document.createElement("option")
    el.textContent = region.navn
    el.value = region.kode
    el.region = region
    ddRegioner.appendChild(el)
}

async function getRegioner() {
    await fetchRegioner()
    console.log(regionList)
    regionList.forEach(fillRegionerDropDown)
}

getRegioner();

*/