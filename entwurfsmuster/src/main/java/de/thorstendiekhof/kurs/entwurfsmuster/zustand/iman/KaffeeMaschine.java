package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeMaschine {
    // Zustaende
    private WartenZustand wartenZustand;
    private KaffeeZubereitenZustand kaffeeZubereitenZustand;
    private KeineBohnenZustand keineBohnenZustand;
    private KeinWasserZustand keinWasserZustand;

    public int anzahlBohnen = 3;
    public int wasserInMl = 2;

    Zustand aktuellerZustand;

    public KaffeeMaschine(){
        this.wartenZustand = new WartenZustand(this);
        this.kaffeeZubereitenZustand = new KaffeeZubereitenZustand(this);
        this.keinWasserZustand = new KeinWasserZustand(this);
        this.keineBohnenZustand = new KeineBohnenZustand(this);
        this.aktuellerZustand = wartenZustand;
    }

    // Cappuccino = 1, Espresso = 2
    public void kaffeeAuswaehlen(int kaffeArt) {
        if (checkIfMaschineBereit()) {
            if (kaffeArt == 1) {
                this.aktuellerZustand = kaffeeZubereitenZustand;
                kaffeeZubereitenZustand.cappuccinoZubereiten();
                wasserUndBohnenAbziehen();
            } else if (kaffeArt == 2) {
                this.aktuellerZustand = kaffeeZubereitenZustand;
                kaffeeZubereitenZustand.espressoZubereiten();
                wasserUndBohnenAbziehen();
            }
        }
    }

    private void wasserUndBohnenAbziehen() {
        wasserInMl--;
        anzahlBohnen--;
    }

    private boolean checkIfMaschineBereit() {
        if (anzahlBohnen == 0) {
            aktuellerZustand = keineBohnenZustand;
            return false;
        } else if (wasserInMl == 0) {
            aktuellerZustand = keinWasserZustand;
            return false;
        }
        return true;
    }


}
