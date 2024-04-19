import java.util.Scanner;
/*  inizio con il crearmi una serie di interfaccie, come luminosità, volume e riproduibile
    sono essenzialmente dei metodi vuoti e gestite nelle diverse classi che andrò a creare successivamente
    secondo quanto detto la traccia.

    poi mi creo una classe astratta, ossia ElementoMultimediale dal quale poi nasceranno classi figlie
    che estenderanno questa classe avente quegli attributi specifici
* */
public class LettoreMultimediale {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // in questo modo sto popolando l'array con un ciclo for inserendo tramite scanner
        //il numero scelto dall'utente
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();
            System.out.print("Inserisci la durata: ");
            int durata = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Inserisci il volume/luminosita: ");
            int volumeLuminosita = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci 1 per Registrazione Audio, 2 per Video, 3 per Immagine:");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    elementi[i] = new RegistrazioneAudio(titolo, durata, volumeLuminosita);
                    break;
                case 2:
                    elementi[i] = new Video(titolo, durata, volumeLuminosita, volumeLuminosita);
                    break;
                case 3:
                    elementi[i] = new ElementoMultimediale(titolo) {
                        @Override
                        void show() {
                            System.out.println("Immagine: " + titolo);
                        }
                    };
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }


        int scelta;
        do {
            System.out.println("Inserisci il numero dell'elemento da riprodurre (da 1 a 5, 0 per uscire):");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                elemento.show();
                if (elemento instanceof RegolabileVolume) {
                    System.out.println("Quante volte vuoi aumentare il volume?");
                    int numAumentiVolume = scanner.nextInt();
                    for (int j = 0; j < numAumentiVolume; j++) {
                        ((RegolabileVolume) elemento).alzaVolume();
                    }
                }
                if (elemento instanceof RegolabileLuminosita) {
                    System.out.println("Quante volte vuoi aumentare la luminosità?");
                    int numAumentiLuminosita = scanner.nextInt();
                    for (int j = 0; j < numAumentiLuminosita; j++) {
                        ((RegolabileLuminosita) elemento).aumentaLuminosita();
                    }
                }
                if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                } else {
                    System.out.println("Questo elemento non è riproducibile.");
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);



    }
}
