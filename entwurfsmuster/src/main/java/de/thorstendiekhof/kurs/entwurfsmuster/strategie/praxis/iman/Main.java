package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.iman;

public class Main {
    public static void main(String [] args) {
        Ritter iman = new Ritter();

        iman.kaempfen();

        iman.wechsleWaffe(new Lanze());
        iman.kaempfen();

    }

}
