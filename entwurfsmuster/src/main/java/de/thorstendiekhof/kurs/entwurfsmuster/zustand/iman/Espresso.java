package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class Espresso implements KaffeeArt {

    @Override
    public void zubereiten() {
        System.out.println("Espresso wird zubereitet!");
    }
}
