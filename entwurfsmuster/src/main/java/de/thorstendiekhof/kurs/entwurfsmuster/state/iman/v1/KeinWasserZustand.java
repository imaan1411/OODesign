package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v1;

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
        this.kaffeeMaschine.wasserInMl +=3;
        System.out.println("Wasser wird aufgefüllt...");
        this.kaffeeMaschine.zustand = this.kaffeeMaschine.wartenZustand;
    }
}
