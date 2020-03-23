package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class KeineBohnenZustand implements Zustand {

    KaffeeMaschine kaffeeMaschine;

    public KeineBohnenZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void warten() {
        System.out.println("Keine Bohnen!");
    }

    @Override
    public void cappuccinoZubereiten() {
        System.out.println("Keine Bohnen! Du kannst keinen Cappuccino zubereiten");
    }

    @Override
    public void espressoZubereiten() {
        System.out.println("Keine Bohnen! Du kannst keinen Espresso zubereiten");
    }

    @Override
    public void keineBohnen() {
        System.out.println("Keine Bohnen! Fülle Bohnen nach!");
    }

    @Override
    public void keinWasser() {
        System.out.println("Keine Bohnen! Du hast ein anderes Problem");
    }
}
