public class chiamata {
    private String numeroChiamato;
    private int durata;

    public chiamata(String numChiamato, int durata) {
        this.numeroChiamato = numChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
