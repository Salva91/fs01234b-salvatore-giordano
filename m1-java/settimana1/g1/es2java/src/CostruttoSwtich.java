import java.util.Scanner;

public class CostruttoSwtich {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci un numero: ");
            int numero = scanner.nextInt();
            stampaNumero(numero);
        }

        public static void stampaNumero(int numero) {
            switch (numero) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Il numero inserito è: " + numero);
                    break;
                default:
                    System.out.println("Errore: Il numero inserito non è compreso tra 1 e 3.");
                    break;
            }
        }
    }
