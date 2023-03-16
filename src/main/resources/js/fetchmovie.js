console.log("vi er i fetchMovie")
const urlPostMovie = "http://localhost:8080/movie"

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

let lstMovies = []

async function actionFetchMovies() {
    lstMovies = await fetchAny(urlMovies);
    console.log(lstMovies)
    lstMovies.forEach(fillMovieDropDown)
}

function fillMovieDropDown(movie) {
    const el = document.createElement("option")
    //Det er nok ikke det rigtige der står, efter; el.
    el.String = movie.title
    el.Date = movie.releaseDate
    el.double = movie.rating
    el.double = movie.length
    el.String = movie.genre
    el.int = movie.ageLimit
    ddMovies.appendChild(el)
}

let body = {}

const postMovieRequest = {
    method: "POST",
    headers: {
        "content-type": "application/json"
    },
    body: body
}

function postMovie(movie) {
    body = JSON.stringify(movie)
    console.log(body)
    postMovieRequest.body = body;
    fetch(urlPostMovie, postMovieRequest).catch((error) => console.log(error));
}

function actionPostAllMovies(bth) {
    console.log("post alle movies");
    lstMovies.forEach(postKMovie)
}


const pbFetchMovies = document.getElementById("pbFetchMovies")
const pbPostMovies = document.getElementById("pbPostMovies")
pbFetchMovies.addEventListener('click', actionFetchMovies)
pbPostMovies.addEventListener('click', actionPostAllMovies)

