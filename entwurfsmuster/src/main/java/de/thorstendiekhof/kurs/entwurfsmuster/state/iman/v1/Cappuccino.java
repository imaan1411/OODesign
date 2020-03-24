package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v1;

public class Cappuccino implements KaffeeArt {

    @Override
    public void zubereiten() {
        System.out.println("Cappuccino wird zubereitet!");
    }
}
