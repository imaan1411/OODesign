package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class Main {
    public static void main(String[] args) {
        KaffeeMaschine kaffeeMaschine = new KaffeeMaschine();

        kaffeeMaschine.toString();

        // Cappuccino zubereiten
        kaffeeMaschine.kaffeeAuswaehlen(1);
        // Espresso zubereiten
        kaffeeMaschine.kaffeeAuswaehlen(2);
        kaffeeMaschine.kaffeeAuswaehlen(1);

        // Wasser auffüllen
        kaffeeMaschine.wasserNachfuellen();
        kaffeeMaschine.toString();

        kaffeeMaschine.bohnenNachfuellen();
        kaffeeMaschine.toString();






    }
}
