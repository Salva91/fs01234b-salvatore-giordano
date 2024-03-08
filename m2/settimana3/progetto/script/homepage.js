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

        // Adding console logs for debugging
        console.log('Request URL:', 'https://striveschool-api.herokuapp.com/api/product/');
        console.log('Request Data:', JSON.stringify(smartphone));

        fetch('https://striveschool-api.herokuapp.com/api/product/', {
            method: 'POST',
            headers: {
                "Authorization": "Bearer YOUR_ACCESS_TOKEN",
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
