fetch('https://striveschool-api.herokuapp.com/api/product/', {
    headers: {
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDc5ZTJkN2IxMTAwMTkwZTZkZDciLCJpYXQiOjE3MDk5MTIxNjIsImV4cCI6MTcxMTEyMTc2Mn0.4zjCm9bZ-6aYrwtTM2L1tWrPUlM9h4CXYNZJvRQFfYI"
    }
})
.then(res => {
    console.log(res); 
    return res.json();
})
    .then(telefoni => {
        for (let telefono of telefoni) {
            console.log(telefono);
            let mobile = generaClone();
    
            let nome = mobile.querySelector('.nome');
            let descrizione = mobile.querySelector('.descrizione');
            let brand = mobile.querySelector('.brand');
            let img = mobile.querySelector('.card-img-top');
            let prezzo = mobile.querySelector('.prezzo');
            let btnModifica = mobile.querySelector('.btnmodifica');
            let btnScopri = mobile.querySelector('.btnscopri');
    
        
            nome.innerText = telefono.name;
            descrizione.innerText = telefono.description;
            brand.innerText = telefono.brand;
            prezzo.innerText = telefono.price;
            img.src = "https://picsum.photos/200/300";
            
    
            document.querySelector('#append').appendChild(mobile);
        }
    })
    
    

    

function generaClone() {
    let template = document.querySelector('#template-telefono');
    let clone = template.content.cloneNode(true);
    return clone;
}
