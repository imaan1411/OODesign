package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

import de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang.Kaffeemaschine;

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
    public void cappuccinoZubereiten(Cappuccino cappuccino) {
        cappuccino.zubereiten();
    }

    @Override
    public void espressoZubereiten(Espresso espresso) {
        espresso.zubereiten();
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
