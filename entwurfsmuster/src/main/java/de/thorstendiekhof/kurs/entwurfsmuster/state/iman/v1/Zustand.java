package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v1;

public interface Zustand {
    void warten();
    void cappuccinoZubereiten();
    void espressoZubereiten();
    void keineBohnen();
    void keinWasser();

}
