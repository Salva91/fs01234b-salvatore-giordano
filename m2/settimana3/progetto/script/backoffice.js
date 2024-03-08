const salva = document.querySelector('#salva');

salva.addEventListener('click', function(e) {
    e.preventDefault();

    
    function createProduct() {
        const productName = document.getElementById('productName').value;
        const productDescription = document.getElementById('productDescription').value;
        const productBrand = document.getElementById('productBrand').value;
        const productPrice = parseFloat(document.getElementById('productPrice').value);
        const productImage = document.getElementById('productImage').value;

        const smartphone = {
            "name": productName,
            "description": productDescription,
            "brand": productBrand,
            "price": productPrice,
            "image": productImage
        };

        fetch('https://striveschool-api.herokuapp.com/api/product/', {
            method: 'POST',
            headers: {
                "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDc5ZTJkN2IxMTAwMTkwZTZkZDciLCJpYXQiOjE3MDk5MTIxNjIsImV4cCI6MTcxMTEyMTc2Mn0.4zjCm9bZ-6aYrwtTM2L1tWrPUlM9h4CXYNZJvRQFfYI",
                'Content-Type': 'application/json'
                
            },
            body: JSON.stringify(smartphone)
        })
        .then(res => res.json())
        .then(res => {
        
            location.href = 'read.html';
        })
        .catch(error => {
            
            console.error('Fetch error:', error.message);
        });
    }

    createProduct();
});
