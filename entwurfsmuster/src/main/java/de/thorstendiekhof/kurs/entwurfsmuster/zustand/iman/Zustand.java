package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public interface Zustand {
    void warten();
    void cappuccinoZubereiten();
    void espressoZubereiten();
    void keineBohnen();
    void keinWasser();

}
