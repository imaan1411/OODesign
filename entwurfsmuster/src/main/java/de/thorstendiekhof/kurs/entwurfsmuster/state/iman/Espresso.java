package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

public class Espresso implements KaffeeArt {

    @Override
    public void zubereiten() {
        System.out.println("Espresso wird zubereitet!");
    }
}
