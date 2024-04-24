package it.epicode.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole da inserire (N): ");
        int N = scanner.nextInt();
        scanner.nextLine(); 

        Set<String> paroleSet = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci le " + N + " parole:");

        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();

            if (!paroleSet.add(parola)) {
                // Se la parola è già presente nel set, è duplicata
                paroleDuplicate.add(parola);
            }
        }

        scanner.close();

        //  Questo mi serve per Stampare delle parole duplicate
        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        // Stampa del numero di parole distinte
        System.out.println("Numero di parole distinte: " + paroleSet.size());

        // Stampa dell'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte:");
        for (String parola : paroleSet) {
            System.out.println(parola);
        }
    }
}
