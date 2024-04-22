package it.epicode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimensioneDesiderata = 5;
        List<Integer> numeri = new ArrayList<>(dimensioneDesiderata);

        for (int i = 0; i < dimensioneDesiderata; i++) {
            numeri.add(numeroCasuale());
        }

        System.out.println("Numeri generati casualmente:");
        for (Integer numero : numeri) {
            System.out.println(numero);
        }

        modificaNumeroeScambialo(numeri);
       
    }

    public static int numeroCasuale() {
        return new Random().nextInt(10) + 1;
    }

    public static void modificaNumeroeScambialo(List<Integer> numeri) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 10");
        int numeroScelto = sc.nextInt();
        System.out.println("Inserisci la posizione dell'array da modificare da 0 a 4");
        int posizioneArray = sc.nextInt();

        if (posizioneArray >= 0 && posizioneArray < numeri.size()) {
            numeri.set(posizioneArray, numeroScelto);
            System.out.println("Numero modificato con successo!");
            
            System.out.println("Lista attuale:");
            for (Integer numero : numeri) {
                System.out.println(numero);
            }
        } else {
            System.out.println("La posizione inserita non è valida.");
            
           
        }
    }
    
}
