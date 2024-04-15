import java.util.Scanner;


public class Esercizio3 {

    public static void main(String[] args) {
        int numero = input("Inserisci un numero: ");
        pariDispari(numero);
    }

    public static int input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void pariDispari(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}
