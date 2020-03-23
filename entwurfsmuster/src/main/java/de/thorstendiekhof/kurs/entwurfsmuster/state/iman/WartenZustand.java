package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

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
        kaffeeMaschine.zustand = kaffeeMaschine.kaffeeZubereitenZustand;
    }

    @Override
    public void espressoZubereiten() {
        kaffeeMaschine.zustand = kaffeeMaschine.kaffeeZubereitenZustand;
    }

    @Override
    public void keineBohnen() {
        kaffeeMaschine.zustand = kaffeeMaschine.keineBohnenZustand;
    }

    @Override
    public void keinWasser() {
        kaffeeMaschine.zustand = kaffeeMaschine.keinWasserZustand;
    }
}
