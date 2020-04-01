package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public abstract class KaffeeSpezialitaet {
    String description = "";

    String getDescription(){
        return description;
    }

    abstract int getPrice();

}
