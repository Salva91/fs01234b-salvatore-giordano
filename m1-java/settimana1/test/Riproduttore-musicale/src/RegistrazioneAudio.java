//classe registrazioneAudio figlia di ElementoMultimediale che implement le interfaccie sottostanti
class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolabileVolume {
    private int durata;
    private int volume;

    // Ho usato come al solito un costruttore parametrizzato
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }
        //il concetto è molto simile a quello delle altre classi, banalmente in questo caso
        // ho utilizzato un annidamento di cicli for, nel quale nel primo loop
        // itera per tutta la lunghezza del video
        // il secondo itera e stampa ! per il numero di N volume
        // in questo caso partiamo sempre dal ciclo interno
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(" " + titolo);
        }
    }

    public void abbassaVolume() {
        if (volume > 0)
            volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void show() {
        System.out.println("Registrazione audio: " + titolo);
    }
}