package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class Espresso implements KoffeinhaltigesGetraenk {

    @Override
    public void zubereiten() {
        System.out.println("Hier Bitte, dein Espresso :).");
    }
}
