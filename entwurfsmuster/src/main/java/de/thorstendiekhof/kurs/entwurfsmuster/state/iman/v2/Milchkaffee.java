package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class Milchkaffee implements KoffeinhaltigesGetraenk {

    @Override
    public void zubereiten() {
        System.out.println("Hier Bitte, dein Milchkaffee :).");
    }
}
