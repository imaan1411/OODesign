package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.ausgang;

public class Main {
    public static void main(String[] args) {
        Einheit krieger = new Krieger();
        Einheit ritter = new Ritter();

        krieger.angreifen();
        ritter.bewegen();
    }
}