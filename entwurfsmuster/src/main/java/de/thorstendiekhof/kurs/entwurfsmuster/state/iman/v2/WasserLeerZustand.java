package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class WasserLeerZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public WasserLeerZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void cappuccinoAuswaehlen() {
        System.out.println("Das Wasser ist leer! Du kannst keinen Cappuccino auswaehlen.");
    }

    @Override
    public void cappuccinoZubereiten() {
    }

    @Override
    public void wasserAuffuellen() {
        System.out.println("Das Wasser ist wieder voll!");
        kaffeeMaschine.anzahlWasser += 4;
        kaffeeMaschine.zustand = kaffeeMaschine.wartenAufAuswahlZustand;
    }

    @Override
    public void bohnenAuffuellen() {
        System.out.println("Das Wasser ist leer! Nicht die Bohnen...");
    }

    @Override
    public void koffeinhaltigesGetraenkAuswaehlen() {

    }

    @Override
    public void koffeinhaltigesGetraenkZubereiten(KoffeinhaltigesGetraenk koffeinhaltigesGetraenk) {

    }
}
