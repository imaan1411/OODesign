package de.thorstendiekhof.kurs.entwurfsmuster.decorator.praxis.ausgang;

public abstract class ZutatDekorierer extends Kaffeespezialitaet {

    Kaffeespezialitaet kaffeespezialitaet;

    ZutatDekorierer(Kaffeespezialitaet kaffeespezialitaet){
        this.kaffeespezialitaet = kaffeespezialitaet;
    }

    public abstract String getBeschreibung();
    
}