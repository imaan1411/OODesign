package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public class Milch extends Decorator {

    public Milch(KaffeeSpezialitaet kaffeeSpezialitaet) {
        super(kaffeeSpezialitaet);
    }

    @Override
    int getPrice() {
        return kaffeespezialitaet.getPrice() + 10;
    }

    @Override
    String getDescription() {
        return kaffeespezialitaet.getDescription() + ", mit Milch";
    }
}
