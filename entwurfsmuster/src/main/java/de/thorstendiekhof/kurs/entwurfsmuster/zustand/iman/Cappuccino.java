package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class Cappuccino implements KaffeeArt {

    @Override
    public void zubereiten() {
        System.out.println("Cappuccino wird zubereitet!");
    }
}
