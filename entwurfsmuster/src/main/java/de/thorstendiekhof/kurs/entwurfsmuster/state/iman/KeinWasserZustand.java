package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class KeinWasserZustand implements Zustand {
    KaffeeMaschine kaffeeMaschine;

    public KeinWasserZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void warten() {
        System.out.println("Kein Wasser!");
    }

    @Override
    public void cappuccinoZubereiten() {
        System.out.println("Kein Wasser! Cappuccino kann nicht zubereitet werden.");
    }

    @Override
    public void espressoZubereiten() {
        System.out.println("Kein Wasser! Espresso kann nicht zubereitet werden.");
    }

    @Override
    public void keineBohnen() {
        System.out.println("Kein Wasser! Du hast ein anderes Problem.");
    }

    @Override
    public void keinWasser() {
        System.out.println("Kein Wasser! Fülle Wasser nach!");
    }
}
