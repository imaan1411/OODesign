package de.thorstendiekhof.kurs.entwurfsmuster.command.iman;

public class Bewegend implements Aktion {
    private Richtung richtung;

    public Bewegend(Richtung richtung) {
        this.richtung = richtung;
    }

    enum Richtung {
        W,
        A,
        S,
        D;
    }

    @Override
    public void ausfuehren() {

        switch (richtung) {
            case W:
                System.out.println("Du bewegst dich nach vorne");
                break;
            case S:
                System.out.println("Du bewegst dich nach hinten");
                break;
            case A:
                System.out.println("Du bewegst dich nach links");
                break;
            case D:
                System.out.println("Du bewegst dich nach rechts");
                break;
            default:
                System.out.println("Falsche Eingabe");
        }

    }
}
