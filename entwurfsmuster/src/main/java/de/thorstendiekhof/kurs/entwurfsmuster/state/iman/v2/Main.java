package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class Main {

    public static void main(String[] args) {
        KaffeeMaschine kaffeeMaschine = new KaffeeMaschine();

        System.out.println("b: " + kaffeeMaschine.anzahlBohnen + ", w: " + kaffeeMaschine.anzahlWasser);

        kaffeeMaschine.cappuccinoAuswaehlen();
        kaffeeMaschine.cappuccinoAuswaehlen();
        kaffeeMaschine.cappuccinoAuswaehlen();
        // Bohnen sind leer :(

        kaffeeMaschine.bohnenAuffuellen();
        kaffeeMaschine.cappuccinoAuswaehlen();
        kaffeeMaschine.cappuccinoAuswaehlen();
        // Wasser ist leer :(

        kaffeeMaschine.wasserAuffuellen();
        kaffeeMaschine.cappuccinoAuswaehlen();
        kaffeeMaschine.cappuccinoAuswaehlen();

        kaffeeMaschine.koffeinhaltigesGetraenkAuswaehlen(new Espresso());
        // Bohnen sind leer :(
        kaffeeMaschine.bohnenAuffuellen();
        kaffeeMaschine.koffeinhaltigesGetraenkAuswaehlen(new Espresso());
    }
}
