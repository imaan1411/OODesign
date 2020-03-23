package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeZubereitenZustand implements Zustand {
    @Override
    public void warten() {
        System.out.println("Kaffee wird zubereitet!");
    }

    @Override
    public void kaffeZubereiten(KaffeeArt art) {
        if (new Cappuccino().equals(art)) {
            new Cappuccino().zubereiten();
        } else if (new Espresso().equals(art)) {
            new Espresso().zubereiten();
        }
    }

    @Override
    public void keineBohnen() {

    }

    @Override
    public void keinWasser() {

    }
}
