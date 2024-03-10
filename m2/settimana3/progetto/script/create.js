
let saveBtn = document.querySelector('#salva')

saveBtn.addEventListener('click', () => {
    
    let name = document.querySelector('#nome').value
    let brand = document.querySelector('#brand').value
    let price = document.querySelector('#prezzo').value
    let imageUrl = document.querySelector('#url').value
    let description = document.querySelector('#descrizione').value

    let telefono = {
        name,
        description,
        brand,
        imageUrl,
        price
    }

    fetch('https://striveschool-api.herokuapp.com/api/product/',{
                method:'POST',
                headers:{
                    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNWU4OTJkN2IxMTAwMTkwZTdhNGYiLCJpYXQiOjE3MDk5MjM5NzcsImV4cCI6MTcxMTEzMzU3N30.72ezU6vDCnwe6z1uIL8mJNsjTpbGfHFkNZSPN7QT-c0",
                    'Content-type':'application/json'
                    
                },
                body:JSON.stringify(telefono)
            })
            .then(res => res.json())
            .then(data => {
                console.log( data);
            
                
                alert('Prodotto aggiunto con successo!');
            
                
                window.location.href = 'homepage.html';
            })
            
})