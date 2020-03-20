package de.thorstendiekhof.kurs.entwurfsmuster.kommando.iman;

public class Spiel {


    public static void main(String[] args) {
        final Spielfigur spielfigur = new Spielfigur();
        spielfigur.setAktionen(new Bewegend(Bewegend.Richtung.W));
        spielfigur.setAktionen(new Bewegend(Bewegend.Richtung.A));
        spielfigur.aktionAusfuehren();

    }
}
