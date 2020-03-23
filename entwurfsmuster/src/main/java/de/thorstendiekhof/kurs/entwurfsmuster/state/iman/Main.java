package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class Main {

    public static void main(String[] args) {
        KaffeeMaschine kaffeeMaschine = new KaffeeMaschine();
        while (kaffeeMaschine != null) {
            kaffeeMaschine.toString();

            // Cappuccino zubereiten
            kaffeeMaschine.kaffeeAuswaehlen(1);
            kaffeeMaschine.kaffeeAuswaehlen(1);
            kaffeeMaschine.kaffeeAuswaehlen(1);

        }
/*
        // Espresso zubereiten
        kaffeeMaschine.kaffeeAuswaehlen(1);

        // Wasser auffüllen
        kaffeeMaschine.wasserNachfuellen();
        kaffeeMaschine.toString();

        kaffeeMaschine.bohnenNachfuellen();
        kaffeeMaschine.toString();
*/






    }
}
