console.log("fetchProducts")
const urlProducts = "http://localhost:8081/products"
const table = document.getElementById("productTable")
function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}


async function createProductTable() {
    const products = await fetchAny(urlProducts)
    console.log(products)
    products.forEach(product => {
        const row = table.insertRow()
        const cell1 = row.insertCell(0)
        const cell2 = row.insertCell(1)
        const cell3 = row.insertCell(2)
        const cell4 = row.insertCell(3)
        cell1.textContent = product.name
        cell2.textContent = product.ageLimit
        cell3.textContent = product.type
        cell4.textContent = product.price
        table.appendChild(cell1)
        table.appendChild(cell2)
        table.appendChild(cell3)
        table.appendChild(cell4)
    })
}