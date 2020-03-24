package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v1;

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
        this.kaffeeMaschine.anzahlBohnen += 4;
        System.out.println("Bohnen werden nachgefüllt...");
        this.kaffeeMaschine.zustand = this.kaffeeMaschine.wartenZustand;
    }

    @Override
    public void keinWasser() {
        System.out.println("Keine Bohnen! Du hast ein anderes Problem");
    }
}
