/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* in JavaScript i principali dataType sono:
1) String dove inseriamo una sequenza di caratteri
2) numero dove inseriamo una serie di numeri
3) boolean/boleano che sta ad indicare una variabile di tipo false o true
4) Null il quale indica che all'interno di una funzione c'è un valore di tipo
5) nullo, ossia c'è qualcosa che non è andato a buon fine all'interno della funzione
6) Undefined indica quando una variabile non ha un valore o che non restituisce un valore

inoltre esistono anche altre dataType, come per esempio
7) gli array che sono variabili che contengono più elementi dello stesso tipo 
o possono anche contenere oggetti
8) oggetti: è una struttura dati più complessa che può contenere sia metodi che proprietà*/

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let myName ="Salvatore";
console.log(myName);

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let a = 10;
let b = 10;
console.log(a+b);

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x =12;

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* myName = Giordano*/

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

console.log(4-x);
console.log(x-4); //non sapevo se rendere l'esito del numero negativo.

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1 = "john";
let name2 = "John";
console.log(name1 != name2);
console.log(name1 == name2);

console.log(name1.toLocaleLowerCase == name2.toLocaleLowerCase);
