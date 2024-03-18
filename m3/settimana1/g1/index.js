var User = /** @class */ (function () {
    function User(nome, cognome) {
        this.creditoResiduo = 0;
        this.numeroChiamate = 0;
        this.nome = nome;
        this.cognome = cognome;
    }
    User.prototype.ricarica = function (ammontare) {
        this.creditoResiduo += ammontare;
    };
    User.prototype.chiamata = function (DurataMinuti) {
        this.creditoResiduo -= (DurataMinuti * 0.20);
        this.numeroChiamate += 1;
    };
    Object.defineProperty(User.prototype, "getNumeroChiamate", {
        get: function () {
            return this.numeroChiamate; // Correzione
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "numero404", {
        get: function () {
            return this.creditoResiduo;
        },
        enumerable: false,
        configurable: true
    });
    User.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return User;
}());
var persona1 = new User("Salvatore", "Giordano");
persona1.ricarica(10);
persona1.chiamata(6);
console.log(persona1.creditoResiduo);
console.log(persona1.getNumeroChiamate); // Stampa il numero di chiamate
console.log(persona1.numero404); // Stampa il credito residuo
persona1.azzeraChiamate();
