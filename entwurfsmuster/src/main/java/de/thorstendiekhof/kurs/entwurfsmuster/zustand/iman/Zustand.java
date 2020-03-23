package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public interface Zustand {
    void warten();
    void cappuccinoZubereiten(Cappuccino cappuccino);
    void espressoZubereiten(Espresso espresso);
    void keineBohnen();
    void keinWasser();

}
