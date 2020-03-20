package de.thorstendiekhof.kurs.entwurfsmuster.kommando.iman;

public class Spiel {


    public static void main(String[] args) {
        final Spielfigur spielfigur = new Spielfigur();
        spielfigur.addAktion(new Bewegend(Bewegend.Richtung.W));
        spielfigur.addAktion(new Bewegend(Bewegend.Richtung.A));
        spielfigur.addAktion(new TrankTrinken(new Heiltrank()));
        spielfigur.aktionenAusfuehren();

    }
}
