package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class KaffeeMaschine {
    BohnenLeerZustand bohnenLeerZustand = new BohnenLeerZustand(this);
    CappuccinoZubereitenZustand cappuccinoZubereitenZustand = new CappuccinoZubereitenZustand(this);
    WartenAufAuswahlZustand wartenAufAuswahlZustand = new WartenAufAuswahlZustand(this);
    WasserLeerZustand wasserLeerZustand = new WasserLeerZustand(this);

    Zustand zustand;

    int anzahlBohnen = 2;
    int anzahlWasser = 3;

    public KaffeeMaschine() {
        zustand = wartenAufAuswahlZustand;
    }

    public void cappuccinoAuswaehlen() {
        zustand.cappuccinoAuswaehlen();
        zustand.cappuccinoZubereiten();
    }

    public void wasserAuffuellen() {
        zustand.wasserAuffuellen();
    }

    public void bohnenAuffuellen() {
        zustand.bohnenAuffuellen();
    }




}
