package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeMaschine {
    // Zustaende
    WartenZustand wartenZustand = new WartenZustand(this);
    KaffeeZubereitenZustand kaffeeZubereitenZustand = new KaffeeZubereitenZustand(this);
    KeineBohnenZustand keineBohnenZustand = new KeineBohnenZustand(this);
    KeinWasserZustand keinWasserZustand = new KeinWasserZustand(this);;

    public int anzahlBohnen = 1;
    public int wasserInMl = 2;

    Zustand zustand;

    public KaffeeMaschine(){
        this.zustand = wartenZustand;
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
        System.out.println("Wasser wird nachgefüllt");
        wasserInMl += 3;
    }

    public void bohnenNachfuellen() {
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
