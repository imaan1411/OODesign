package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class CappuccinoZubereitenZustand implements Zustand {

    private KaffeeMaschine kaffeeMaschine;

    public CappuccinoZubereitenZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void cappuccinoAuswaehlen() {
        System.out.println("Cappuccino wird zubereitet.");
    }

    @Override
    public void cappuccinoZubereiten() {
        this.kaffeeMaschine.anzahlBohnen--;
        this.kaffeeMaschine.anzahlWasser--;

        System.out.println("Hier Bitte! Dein Cappuccino :)");

        if (kaffeeMaschine.anzahlWasser == 0) {
            kaffeeMaschine.zustand = kaffeeMaschine.wasserLeerZustand;
        } else if (kaffeeMaschine.anzahlBohnen == 0) {
            kaffeeMaschine.zustand = kaffeeMaschine.bohnenLeerZustand;
        } else {
            kaffeeMaschine.zustand = kaffeeMaschine.wartenAufAuswahlZustand;
        }
    }

    @Override
    public void wasserAuffuellen() {
        System.out.println("Cappuccino wird zubereitet.");
    }

    @Override
    public void bohnenAuffuellen() {
        System.out.println("Cappuccino wird zubereitet.");
    }

    @Override
    public void koffeinhaltigesGetraenkAuswaehlen() {

    }

    @Override
    public void koffeinhaltigesGetraenkZubereiten(KoffeinhaltigesGetraenk koffeinhaltigesGetraenk) {

    }
}
