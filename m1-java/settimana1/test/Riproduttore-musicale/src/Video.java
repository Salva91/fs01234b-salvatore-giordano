// classe video che estende ElementoMultimediale e implementa le seguenti interfacce.
class Video extends ElementoMultimediale implements Riproducibile, RegolabileVolume, RegolabileLuminosita {
    private int durata;
    private int volume;
    private int luminosita;
    // ho creato un costruttore che ci permette di parametrizzare il titolo, la durata, il volume e la luminosità
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getDurata() {
        return durata;
    }
    /*
    Questo metodo play()l'ho utilizzato per  creare una rappresentazione visiva della riproduzione di un video,
    stampando righe di caratteri

Utilizza un loop esterno che itera per la durata del video (durata).
All'interno di questo loop, crea una stringa vuota chiamata line.
Utilizza un secondo loop interno che aggiunge un numero di caratteri "!"
alla stringa line, basato sul valore del volume del video (volume).
Utilizza un terzo loop interno che aggiunge un numero di caratteri "*"
alla stringa line, basato sul valore della luminosità del video (luminosita).
Una volta che entrambi i loop interni sono terminati, la stringa
line viene stampata insieme al titolo del video (titolo).

volevo sottolineare che in questo loop non parte dall'ultimo verso il primo come accade con i cicli annidati

ho usato per un po' java utilizzando le matrici!

    * */
    public void play() {
        for (int i = 0; i < durata; i++) {
            String line = "";
            for (int j = 0; j < volume; j++) {
                line += "!";
            }
            for (int k = 0; k < luminosita; k++) {
                line += "*";
            }
            System.out.println(line + " " + titolo);
        }
    }

        //molto banalmente se il volume è maggiore di 0 il volume diminuisce di 1
    public void abbassaVolume() {
        if (volume > 0)
            volume--;
    }

    //opposto di quello di prima
    public void alzaVolume() {
        volume++;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0)
            luminosita--;
    }

    public void show() {
        System.out.println("Video: " + titolo);
    }
}