package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class Main {

    public static void main(String[] args) {
        KaffeeMaschine kaffeeMaschine = new KaffeeMaschine();

        // Cappuccino zubereiten
        kaffeeMaschine.kaffeeAuswaehlen(1);
        kaffeeMaschine.kaffeeAuswaehlen(1);
        kaffeeMaschine.kaffeeAuswaehlen(1);

    }
}
