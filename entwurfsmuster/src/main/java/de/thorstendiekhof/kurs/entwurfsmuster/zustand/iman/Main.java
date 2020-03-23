package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class Main {
    public static void main(String[] args) {
        KaffeeMaschine kaffeeMaschine = new KaffeeMaschine();


        System.out.println("Aktueller Zustand: " + kaffeeMaschine.aktuellerZustand);
        // Cappuccino zubereiten
        kaffeeMaschine.kaffeeAuswaehlen(1);
        System.out.println("Aktueller Zustand: " + kaffeeMaschine.aktuellerZustand);
        kaffeeMaschine.kaffeeAuswaehlen(2);
        System.out.println("Aktueller Zustand: " + kaffeeMaschine.aktuellerZustand);
        kaffeeMaschine.kaffeeAuswaehlen(1);
        System.out.println("Aktueller Zustand: " + kaffeeMaschine.aktuellerZustand);
        kaffeeMaschine.kaffeeAuswaehlen(2);
        System.out.println("Aktueller Zustand: " + kaffeeMaschine.aktuellerZustand);

    }
}
