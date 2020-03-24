package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class KoffeinHaltigesGetraenkZubereitenZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public KoffeinHaltigesGetraenkZubereitenZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void cappuccinoAuswaehlen() {

    }

    @Override
    public void cappuccinoZubereiten() {

    }

    @Override
    public void wasserAuffuellen() {

    }

    @Override
    public void bohnenAuffuellen() {

    }

    @Override
    public void koffeinhaltigesGetraenkAuswaehlen() {

    }

    @Override
    public void koffeinhaltigesGetraenkZubereiten(KoffeinhaltigesGetraenk koffeinhaltigesGetraenk) {

        if (koffeinhaltigesGetraenk instanceof Espresso) {
            new Espresso().zubereiten();
        } else if (koffeinhaltigesGetraenk instanceof Milchkaffee) {
            new Milchkaffee().zubereiten();
        }
        kaffeeMaschine.zustand = kaffeeMaschine.wartenAufAuswahlZustand;
    }
}
