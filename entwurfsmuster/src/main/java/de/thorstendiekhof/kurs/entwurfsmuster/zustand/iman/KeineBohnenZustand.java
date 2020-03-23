package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KeineBohnenZustand implements Zustand {
    KaffeeMaschine kaffeeMaschine;

    @Override
    public void warten() {
        System.out.println("Keine Bohnen!");
    }

    @Override
    public void cappuccinoZubereiten(Cappuccino cappuccino) {
        System.out.println("Keine Bohnen! Du kannst keinen Cappuccino zubereiten");
    }

    @Override
    public void espressoZubereiten(Espresso espresso) {
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
