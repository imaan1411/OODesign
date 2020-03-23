package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.iman;

public abstract class Einheit {

    Kampfverhalten kampfverhalten;


    public void kaempfen() {
        kampfverhalten.kaempfen();
    }

    public void wechsleWaffe(Kampfverhalten kampfverhalten) {
        System.out.println("COVER ME! CHANGING WEAPON...");
        this.kampfverhalten = kampfverhalten;
    }
}
