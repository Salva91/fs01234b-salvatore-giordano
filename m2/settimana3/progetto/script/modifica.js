import Telefono from "./classeprodotto";
let url = new URLSearchParams(location.search);
let id = url.get('id');

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
    method: 'GET',
    headers: {
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNWU4OTJkN2IxMTAwMTkwZTdhNGYiLCJpYXQiOjE3MDk5MjM5NzcsImV4cCI6MTcxMTEzMzU3N30.72ezU6vDCnwe6z1uIL8mJNsjTpbGfHFkNZSPN7QT-c0",
        'Content-type': 'application/json'
    }
})
    .then(res => res.json())
    .then(telefono => {
        let imageUrl = document.querySelector('#url');
        let name = document.querySelector('#nome');
        let price = document.querySelector('#prezzo');
        let description = document.querySelector('#descrizione');
        let brand = document.querySelector("#brand");


        name.value = telefono.name;
        brand.value = telefono.brand;
        price.value = telefono.price;
        imageUrl.value = telefono.imageUrl;
        description.value = telefono.description;
    });

const salva = document.querySelector("#salva");

salva.addEventListener('click', () => {
    let name = document.querySelector('#nome').value;
    let brand = document.querySelector('#brand').value;
    let price = document.querySelector('#prezzo').value;
    let imageUrl = document.querySelector('#url').value;
    let description = document.querySelector('#descrizione').value;

    let telefono = new Telefono (name,brand,price,imageUrl,description);

    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
        method: 'put',
        headers: {
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNWU4OTJkN2IxMTAwMTkwZTdhNGYiLCJpYXQiOjE3MDk5MjM5NzcsImV4cCI6MTcxMTEzMzU3N30.72ezU6vDCnwe6z1uIL8mJNsjTpbGfHFkNZSPN7QT-c0",
            'Content-type': 'application/json'
        },
        body: JSON.stringify(telefono)
    })
        .then(res => res.json())
        .then(data => {
            console.log(data);
            alert('Prodotto modificato con successo!');
            location.href = 'homepage.html';
        });
});
