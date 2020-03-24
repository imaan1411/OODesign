package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class KaffeeMaschine {
    // Zustaende
    public WartenZustand wartenZustand = new WartenZustand(this);
    public KaffeeZubereitenZustand kaffeeZubereitenZustand = new KaffeeZubereitenZustand(this);
    public KeineBohnenZustand keineBohnenZustand = new KeineBohnenZustand(this);
    public KeinWasserZustand keinWasserZustand = new KeinWasserZustand(this);

    public int anzahlBohnen = 1;
    public int wasserInMl = 2;

    public Zustand zustand;

    public KaffeeMaschine(){
        this.zustand = wartenZustand;
        this.zustand.warten();
    }

    // Cappuccino = 1, Espresso = 2
    public void kaffeeAuswaehlen(int kaffeArt) {
        if (kaffeArt == 1) {
            this.zustand.cappuccinoZubereiten();

        } else if (kaffeArt == 2) {
            this.zustand.espressoZubereiten();
        }
    }

    public void kaffeemaschineWartetAufInput() {
        this.zustand.warten();
    }

    public void wasserNachfuellen() {
        this.zustand.keinWasser();
    }

    public void bohnenNachfuellen() {
        //not implemented
        System.out.println("Bohnen werden nachgefüllt");
        anzahlBohnen += 4;
    }


    @Override
    public String toString() {
        System.out.println("\n");
        zustand.warten();
        System.out.println("Anzahl Bohnen: " + anzahlBohnen + ", Wasser in ml: " + wasserInMl);
        System.out.println("\n");
        return null;
    }


}
