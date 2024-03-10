fetch('https://striveschool-api.herokuapp.com/api/product/', {
    method: 'GET',
    headers: {
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNWU4OTJkN2IxMTAwMTkwZTdhNGYiLCJpYXQiOjE3MDk5MjM5NzcsImV4cCI6MTcxMTEzMzU3N30.72ezU6vDCnwe6z1uIL8mJNsjTpbGfHFkNZSPN7QT-c0",
        'Content-type': 'application/json'
    }
})
    .then(res => res.json())
    .then(telefoni => {
        console.log(telefoni)
        for (let telefono of telefoni) {
            let card = createClone();

            let img = card.querySelector('#img');
            let name = card.querySelector('#name');
            let price = card.querySelector('#price');
            let editBtn = card.querySelector('#edit');
            let deleteBtn = card.querySelector('#delete');

            img.src = telefono.imageUrl;
            name.innerText = telefono.name;
            price.innerText = telefono.price;
            editBtn.href = `pagina-modifica.html?id=${telefono._id}`;
            deleteBtn.dataset.id = telefono._id;

            //  ho aggiunto il delete sul foglio della read

            deleteBtn.addEventListener('click', () => {
                let productId = deleteBtn.dataset.id;

                fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}`, {
                    method: 'DELETE',
                    headers: {
                        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNWU4OTJkN2IxMTAwMTkwZTdhNGYiLCJpYXQiOjE3MDk5MjM5NzcsImV4cCI6MTcxMTEzMzU3N30.72ezU6vDCnwe6z1uIL8mJNsjTpbGfHFkNZSPN7QT-c0",
                        'Content-type': 'application/json'
                    }
                })
                    .then(res => res.json())
                    .then(data => {
                        console.log(data);
                        alert('Prodotto eliminato con successo!');
                        deleteBtn.closest('.card').remove()
                    });
            });

            document.querySelector('.row').append(card);
        };
    })

function createClone() {
    let template = document.querySelector('#template');
    let clone = template.content.cloneNode(true);
    return clone;
}

function vaiAlLinkCreaProdotto () {
    let creaprodotto =document.querySelector("#creaprodotto")
    creaprodotto.addEventListener('click', () => {
        window.location.href= "backoffice.html"

        
    });
}

vaiAlLinkCreaProdotto();