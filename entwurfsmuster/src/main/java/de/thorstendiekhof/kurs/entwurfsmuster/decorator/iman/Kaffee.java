package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public class Kaffee extends KaffeeSpezialitaet {

    @Override
    String getDescription() {
        return "Das ist ein Kaffee";
    }

    @Override
    int getPrice() {
        return 100;
    }
}
