let tabellone = document.querySelector('.tabellone');

for(let i = 1; i <= 90; i++ ){
    let numeri = document.createElement('div');
    numeri.classList.add('celle');
    numeri.innerText = i;
    tabellone.append(numeri);
}

let creaBottone = document.querySelector('.conteiner-bottone');
let bottone = document.createElement('button');
bottone.innerText = 'premi qui';
creaBottone.appendChild(bottone);
bottone.style.backgroundColor = '#63925A'

let risultatoElement = document.createElement('p');
creaBottone.appendChild(risultatoElement);

let numeriGenerati = [];

bottone.addEventListener('click', function() {
    let numeroCasuale;
      
    do {
        numeroCasuale = Math.floor(Math.random() * 90) + 1;
    } while (numeriGenerati.includes(numeroCasuale));

    numeriGenerati.push(numeroCasuale);

    risultatoElement.innerText = "Numero generato: " + numeroCasuale;

    let numeriTabellone = document.querySelectorAll('.celle');
    numeriTabellone.forEach(function(numero) {
        if (numero.innerText == numeroCasuale) {
            numero.classList.add('selezionato');
        }
    });
});
