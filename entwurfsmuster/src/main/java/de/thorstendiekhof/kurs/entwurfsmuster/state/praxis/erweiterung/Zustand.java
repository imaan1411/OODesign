package de.thorstendiekhof.kurs.entwurfsmuster.state.praxis.erweiterung;

public interface Zustand {
    void kaffeeAuswaehlen();
    void espressoAuswaehlen();
    void kaffeeBereiten();
    void espressoBereiten();
    void bohnenAuffuellen();
    
    void geldEinwerfen();
}