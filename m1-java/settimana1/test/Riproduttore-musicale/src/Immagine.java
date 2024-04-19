
public class Immagine {

    private int luminosita;
    private String titolo;

    // Costruttore che imposta la luminosità e il titolo
    public Immagine(int luminosita, String titolo) {
        this.luminosita = luminosita;
        this.titolo = titolo;
    }

    // Metodo per ottenere la luminosità
    public int getLuminosita() {
        return luminosita;
    }

    // Metodo per impostare la luminosità
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    // Metodo per visualizzare l'immagine
    public void play() {
        // Inizializzo una stringa vuota
        String line = "";

        // Aggiungo "*" al numero di volte corrispondente alla luminosità
        for (int i = 0; i < luminosita; i++) {
            line += "*";
        }

        // Stampo la stringa di "*" seguita dal titolo
        System.out.println(line + " " + titolo);
    }

    // Metodo per aumentare la luminosità
    public void aumentaLuminosita() {
        luminosita++;
    }

    // Metodo per diminuire la luminosità
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}


