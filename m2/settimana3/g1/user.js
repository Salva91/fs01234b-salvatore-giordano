class User {
    constructor(firstName, lastName, age, location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

    confrontoEta(persona1,persona2) {
        if (persona1.age > persona2.age) {
            return `L'età di ${persona1.firstName} è maggiore di ${persona2.firstName}`;
        } else if (persona1.age < persona2.age) {
            return `L'età di ${persona1.firstName} è minore di ${persona2.firstName}`;
        } else {
            return `Le età di ${persona1.firstName} e ${persona2.firstName} sono uguali`;
        }
    }
}

let persona1 = new User("Michele", "Tedesco", 33, "Napoli");
let persona2 = new User("Salvatore", "Giordano", 32, "Napoli");


console.log((new User()).confrontoEta(persona1, persona2));

