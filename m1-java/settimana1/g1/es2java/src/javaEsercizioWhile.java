public class javaEsercizioWhile {

//1 dichiarare una stringa che contenga una parola
    // creare variabile che contenga successivamente la parola divisa

    // creo un array che contiene la parola da splittare e la riunisco con una join

    public static void main(String[] args) {
        String parola = "ciao,mondo";
        String parolaDivisa = parolaDaDividere(parola);
        System.out.println(parolaDivisa);
    }

    public static String parolaDaDividere(String parola) {
        String[] caratteri = parola.split("");
        return String.join(",", caratteri);
    }
}



