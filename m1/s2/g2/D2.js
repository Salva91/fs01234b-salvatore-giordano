/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/
{
let a = 21;
let b = 20;

if (a > b) {
  console.log("Il numero maggiore è " + a);
} else if (b > a) {
  console.log("Il numero maggiore è " + b);
} else {
  console.log("I numeri sono uguali");
}
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/
{
let numero = 10;
if(numero != 5){
  console.log(" Il numero " + numero + " è diverso da " + 5);//so che dovevo scrivere not equal nella console, ma ho preferito esercitarmi con le concatenazioni
}
}
/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/
{
let divisibile = 25;

if (divisibile %5==0){
  console.log("il numero" + divisibile + "è divisibile per 5 ");
}else {
  console.log ("Il numero "+ divisibile + "non è divisibile per 5");
}
}
/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/
{
  let numero1 = 17;
  let numero2 = 8;
  somma= numero1+ numero2;
  sottrazione = numero1 - numero2;
  if(numero1 == 8 || numero2 == 8){
    console.log("il valore di uno dei due numeri è uguale a 8");
   
    if(somma ==8 || sottrazione==8){
      console.log("l valore della sottrazione o dell'addizione non è pari a 8");
    
    }else{
      console.log("il valore della sottrazione o dell'addizione non è pari a 8");
    }

  } else{
    console.log("il valore di nessuno dei due numeri è uguale a 8");
  }

}


/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

{
  let totalShoppingCart = 0;
  let maglia = 21;
  let pantaloncino =15;
  let portafogli = 15;
  totalShoppingCart=totalShoppingCart+maglia+pantaloncino+portafogli;
  console.log(" C'è una promozione in corso, se il totale della spesa supera i 50 hai diritto alla spedizione gratuita")
  if (totalShoppingCart>=50)
  {
    console.log("Complimenti, hai diritto alla spedizione gratuita");
    
  }else{
    console.log("Mi dispiace, ma non hai diritto alla spedizione gratuita");
    
  }
  console.log (" l'ammontare totale della spesa è di " + totalShoppingCart);


}

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

{
let blackFriday = 0.20;
let totalShoppingCart = 0;
let maglia = 20;
let pantaloncino =15;
let portafogli = 15;
totalShoppingCart=totalShoppingCart+maglia+pantaloncino+portafogli;
let totaleConSconto = totalShoppingCart * (1 - blackFriday);


console.log(" Oggi è il blackFriday e viene applicato uno sconto del 20% su ogni prodotto")
if (totaleConSconto>=50)
{
  console.log("Complimenti, hai diritto alla spedizione gratuita");
  console.log (" l'ammontare totale della spesa è di " + totalShoppingCart);
}else{
  console.log("Mi dispiace, ma non hai diritto alla spedizione gratuita");
  
}


}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/
{
  let n1 = 4;
let n2 = 10;
let n3 = 2;
if (n1 >= n2 && n1 >= n3) {
    if (n2 >= n3) {
        console.log(n1, n2, n3);
    } else {
        console.log(n1, n3, n2);
    }
} else if (n2 >= n1 && n2 >= n3) {
    if (n1 >= n3) {
        console.log(n2, n1, n3);
    } else {
        console.log(n2, n3, n1);
    }
} else {
    if (n1 >= n2) {
        console.log(n3, n1, n2);
    } else {
        console.log(n3, n2, n1);
    }
} // questo esercizio mi ha fatto perdere i neuroni!

}

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

{
  let x = 10;
  if ( typeof x === "number"){
    console.log(" il valore fornito in input è un numero ");

  }else{
    console.log(" il valore fornito in input non è un numero ");
  }
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

{
  let numero = 21;
  if( numero%2==0){
    console.log(" il numero è pari ");
  }else{
    console.log(" il numero è dispari ")
  }
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

{
  let val = 7;

if (val < 5) {
    console.log("Meno di 5");
} else if (val < 10) {
    console.log("Meno di 10, maggiore/ uguale a 5");
} else {
    console.log("Uguale o maggiore di 10");
}

}

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/
{
const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city = 'Toronto';
}


/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

{
  const me = {
    name: 'John',
    lastName: 'Doe',
    skills: ['javascript', 'html', 'css'],
  }
  me.city = 'Toronto';
  delete me.lastName;
  }
  

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

{
  const me = {
    name: 'John',
    lastName: 'Doe',
    skills: ['javascript', 'html', 'css'],
  };

  me.city = 'Toronto';
  delete me.lastName;

  // Rimuovi l'ultimo elemento dall'array "skills"
  me.skills.pop();

  console.log(me.skills);
}



/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/
{
const array = [];
array.push(1);
array.push(2);
array.push(3);
array.push(4);
array.push(5);
array.push(6);
array.push(7);
array.push(8);
array.push(9);
array.push(10);
console.log(array.length);

//metodo con il ciclo for
 
const list = []; // ciclo while

for (let i = 1; i <= 10; i++) {
  list.push(i);
}

console.log(list.length); 


}

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

const list = []; // ciclo while

for (let i = 1; i <= 10; i++) {
  list.push(i);
  
  

}
list[list.length - 1] = 100;
console.log(list);
