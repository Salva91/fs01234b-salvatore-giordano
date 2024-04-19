abstract class ElementoMultimediale {
    //questa è la classe astratta dalla quale andremo poi a creare le classi figlie

    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    abstract void show();
}
