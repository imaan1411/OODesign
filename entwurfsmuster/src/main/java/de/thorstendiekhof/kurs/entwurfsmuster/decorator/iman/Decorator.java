package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public abstract class Decorator extends KaffeeSpezialitaet {
    KaffeeSpezialitaet kaffeespezialitaet;

    public Decorator(KaffeeSpezialitaet kaffeeSpezialitaet) {
        this.kaffeespezialitaet = kaffeeSpezialitaet;
    }


}
