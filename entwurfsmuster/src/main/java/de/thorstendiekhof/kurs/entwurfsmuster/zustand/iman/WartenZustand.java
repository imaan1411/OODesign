package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class WartenZustand implements Zustand {
    private final KaffeeMaschine kaffeeMaschine;

    public WartenZustand(KaffeeMaschine kaffeemaschine) {
        this.kaffeeMaschine = kaffeemaschine;
    }

    @Override
    public void warten() {
        System.out.println("Bitte wähle zwischen einem Cappuccino oder einem Espresso.");
    }

    @Override
    public void cappuccinoZubereiten() {
        new Cappuccino().zubereiten();
    }

    @Override
    public void espressoZubereiten() {
        new Espresso().zubereiten();
    }

    @Override
    public void keineBohnen() {
        System.out.println("Es hat keine Bohnen mehr. Fülle Bohnen nach!");

    }

    @Override
    public void keinWasser() {
        System.out.println("Es hat kein Wasser mehr. Fülle Wasser nach!");

    }
}
