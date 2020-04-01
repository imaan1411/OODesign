package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public class Zucker extends Decorator {

    public Zucker(KaffeeSpezialitaet kaffeeSpezialitaet) {
        super(kaffeeSpezialitaet);
    }

    @Override
    String getDescription() {
        return kaffeespezialitaet.getDescription() + ", mit Zucker";
    }

    @Override
    int getPrice() {
        return kaffeespezialitaet.getPrice() + 20;
    }
}
