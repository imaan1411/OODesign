package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeZubereitenZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public KaffeeZubereitenZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void warten() {
        System.out.println("Kaffee wird zubereitet!");
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
        System.out.println("Es kann kein Kaffe zubereitet werden, da es keine Bohnen mehr gibt.");
    }

    @Override
    public void keinWasser() {
        System.out.println("Es kann kein Kaffe zubereitet werden, da es kein Wasser mehr gibt.");
    }
}
