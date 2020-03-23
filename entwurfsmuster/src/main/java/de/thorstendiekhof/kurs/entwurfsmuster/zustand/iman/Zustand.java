package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public interface Zustand {
    void warten();
    void kaffeZubereiten(KaffeeArt art);
    void keineBohnen();
    void keinWasser();

}
