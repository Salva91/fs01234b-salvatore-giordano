//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int risultato = moltiplicazione(10, 5);

        System.out.println("Il risultato della moltiplicazione è: " + risultato);
        String risultatoConcatenazione = concatenazione("ciao", 10);
        System.out.println(risultatoConcatenazione);
    }

    public static int moltiplicazione(int a, int b) {
        int c = a * b;
        return c;
    }

    public static String concatenazione(String parola, int numero) {
        String risultatoConcatenazione = "La parola è " + parola + ", mentre il numero è: " + numero;
        return risultatoConcatenazione;
        String[] arrayIniziale = arrayDiStringhe();
        String[] nuovoArray = inserisciStringa(arrayIniziale, "nuovaStringa", 3);
        System.out.println("Nuovo array di stringhe: " + Arrays.toString(nuovoArray));
    }

    public static String[] arrayDiStringhe(){
        String[] arrStringhe = {"ciao", "mi", "chiamo", "Salvatore", "Giordano"};
        return arrStringhe;
    }

    public static String[] inserisciStringa(String[] array, String stringa, int posizione) {
        String[] newArray = new String[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < posizione) {
                newArray[i] = array[i];
            } else if (i == posizione) {
                newArray[i] = stringa;
            } else {
                newArray[i] = array[i - 1];
            }
        }

        return newArray;
    }

}
