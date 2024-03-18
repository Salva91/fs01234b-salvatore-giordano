interface iTelefono {
    creditoResiduo: number;
    numeroChiamate: number;

    ricarica(ammontare: number): void;
    chiamata(DurataMinuti: number): void;
    get getNumeroChiamate(): number;
    get numero404(): number;
    azzeraChiamate(): void;
}

class User implements iTelefono {
    nome: string;
    cognome: string;
    creditoResiduo: number = 0;
    numeroChiamate: number = 0;

    constructor(nome: string, cognome: string) {
        this.nome = nome;
        this.cognome = cognome;
    }
    ricarica(ammontare: number): void {
        this.creditoResiduo += ammontare;
    }
    chiamata(DurataMinuti: number): void {
        this.creditoResiduo -= (DurataMinuti * 0.20);
        this.numeroChiamate += 1;
    }
    get getNumeroChiamate(): number {
        return this.numeroChiamate; // Correzione
    }
    get numero404(): number {
        return this.creditoResiduo;
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0;
    }
}

let persona1 = new User("Salvatore", "Giordano");
persona1.ricarica(10);
persona1.chiamata(6);
console.log(persona1.creditoResiduo);
console.log(persona1.getNumeroChiamate); // Stampa il numero di chiamate
console.log(persona1.numero404); // Stampa il credito residuo
persona1.azzeraChiamate();
