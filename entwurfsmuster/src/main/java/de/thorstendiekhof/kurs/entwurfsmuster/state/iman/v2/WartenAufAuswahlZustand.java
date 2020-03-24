package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class WartenAufAuswahlZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public WartenAufAuswahlZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void cappuccinoAuswaehlen() {
        kaffeeMaschine.zustand = kaffeeMaschine.cappuccinoZubereitenZustand;
    }

    @Override
    public void cappuccinoZubereiten() {
        System.out.println("Wähle Bitte einen Cappuccino aus!");
    }

    @Override
    public void wasserAuffuellen() {
        System.out.println("Wähle Bitte einen Cappuccino aus!");
    }

    @Override
    public void bohnenAuffuellen() {
        System.out.println("Wähle Bitte einen Cappuccino aus!");
    }

    @Override
    public void koffeinhaltigesGetraenkAuswaehlen() {
        kaffeeMaschine.zustand = kaffeeMaschine.koffeinHaltigesGetraenkZubereitenZustand;
    }

    @Override
    public void koffeinhaltigesGetraenkZubereiten(KoffeinhaltigesGetraenk koffeinhaltigesGetraenk) {
        System.out.println("Wähle Bitte ein koffeinhaltiges Getränk aus!");
    }
}
