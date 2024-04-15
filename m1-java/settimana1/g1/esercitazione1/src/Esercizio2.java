import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        String variabile1 = input("1° stringa: ");
        String variabile2 = input("2° stringa: ");
        String variabile3 = input("3° stringa: ");

        String concatenata = variabile1 + variabile2 + variabile3;
        System.out.println("Stringa concatenata: " + concatenata);
    }

    public static String input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }
}


