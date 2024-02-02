/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento dell'array in console.
*/
{
const pets = ['dog', 'cat', 'hamster', 'redfish']
for (let i = 0; i < pets.length; i++){
  console.log(pets);
}
}


/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets".
*/
{
const pets = ['dog', 'cat', 'hamster', 'redfish']
for (let i = 0; i <pets.length; i++){
  pets.sort();

}
console.log(pets);
}


/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/
{
  const pets = ['dog', 'cat', 'hamster', 'redfish']
  for (let i = 0; i <pets.length; i++){
    pets.sort();
    pets.reverse();
  }
  console.log(pets);

}


/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione.
*/
{
  let variabileTemporanea;
const pets = ['dog', 'cat', 'hamster', 'redfish'];

// Sposta il primo elemento in ultima posizione
variabileTemporanea = pets.shift();
pets.push(variabileTemporanea);

console.log(pets);
}


/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta.
*/
const cars = [
  {
    brand: 'Ford',
    model: 'Fiesta',
    color: 'red',
    trims: ['titanium', 'st', 'active'],
  },
  {
    brand: 'Peugeot',
    model: '208',
    color: 'blue',
    trims: ['allure', 'GT'],
  },
  {
    brand: 'Volkswagen',
    model: 'Polo',
    color: 'black',
    trims: ['life', 'style', 'r-line'],
  },
];

for (let i = 0; i < cars.length; i++) {
  const random = Math.random().toString(36).substring(2, 8);
  cars[i].licensePlate = random;
}

console.log(cars);


/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array "cars", rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto.
*/
{
  const cars = [
    {
      brand: 'Ford',
      model: 'Fiesta',
      color: 'red',
      trims: ['titanium', 'st', 'active'],
    },
    {
      brand: 'Peugeot',
      model: '208',
      color: 'blue',
      trims: ['allure', 'GT'],
    },
    {
      brand: 'Volkswagen',
      model: 'Polo',
      color: 'black',
      trims: ['life', 'style', 'r-line'],
    },
  ];
  let nuovaAuto = {
    brand: 'Ferrari',
    model: 'cavallo',
    color: 'red',
    trims: ['titanio', 'st', 'active']
  };

  cars.push(nuovaAuto);
  for (let i = 0; i <cars.length; i++){
    cars[i].trims.pop();

  }
  console.log(cars);
}

/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito.
*/
{
const justTrims = [];

const cars = [
  {
    brand: 'Ford',
    model: 'Fiesta',
    color: 'red',
    trims: ['titanium', 'st', 'active'],
  },
  {
    brand: 'Peugeot',
    model: '208',
    color: 'blue',
    trims: ['allure', 'GT'],
  },
  {
    brand: 'Volkswagen',
    model: 'Polo',
    color: 'black',
    trims: ['life', 'style', 'r-line'],
  },
];

for (let i = 0; i < cars.length; i++) {
  let primoTrim = cars[i].trims[0];
  justTrims.push(primoTrim);
}
console.log(justTrims);
}



/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/
{
  const cars = [
    {
      brand: 'Ford',
      model: 'Fiesta',
      color: 'red',
      trims: ['titanium', 'st', 'active'],
    },
    {
      brand: 'Peugeot',
      model: '208',
      color: 'blue',
      trims: ['allure', 'GT'],
    },
    {
      brand: 'Volkswagen',
      model: 'Polo',
      color: 'black',
      trims: ['life', 'style', 'r-line'],
    },
  ];
   for (let i = 0; i < cars.length; i++){
    if (cars[i].color.charAt(0) === 'b'){
      console.log("Fizz");
    }else {
      console.log("Buzz");
    }
   }

}


/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32.
*/
{
const numericArray = [
  6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,
];

let i = 0;

while (i < numericArray.length && numericArray[i] !== 32) {
  console.log(numericArray[i]);
  i++;
}
}

/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/

{
  array2 = [];
  const charactersArray = ['g', 'n', 'u', 'z', 'd']
  for (i = 0; i < charactersArray.length; i ++){
    let carattere = charactersArray[i].charCodeAt(0);
      let lettereItaliane = carattere - "a".charCodeAt(0)+1;
      array2.push(lettereItaliane)
  }
  console.log(array2);

}

{
  let inputArray = ['g', 'n', 'u', 'z', 'd']; 
let outputArray = []; 

for(let i = 0; i < inputArray.length; i++) {
    switch(inputArray[i]) {
        case 'a': outputArray.push(1); 
        break;
        case 'b': outputArray.push(2); 
        break;
        case 'c': outputArray.push(3); 
        break;
        case 'd': outputArray.push(4); 
        break;
        case 'e': outputArray.push(5); 
        break;
        case 'f': outputArray.push(6); 
        break;
        case 'g': outputArray.push(7); 
        break;
        case 'h': outputArray.push(8); 
        break;
        case 'i': outputArray.push(9); 
        break;
        case 'l': outputArray.push(10); 
        break;
        case 'm': outputArray.push(11); 
        break;
        case 'n': outputArray.push(12); 
        break;
        case 'o': outputArray.push(13); 
        break;
        case 'p': outputArray.push(14); 
        break;
        case 'q': outputArray.push(15); 
        break;
        case 'r': outputArray.push(16); 
        break;
        case 's': outputArray.push(17); 
        break;
        case 't': outputArray.push(18); 
        break;
        case 'u': outputArray.push(19); 
        break;
        case 'v': outputArray.push(20); 
        break;
        case 'z': outputArray.push(21); 
        break;
        
    }
}

console.log(outputArray); 
}