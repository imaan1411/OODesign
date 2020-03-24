package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public interface Zustand {
    void cappuccinoAuswaehlen();
    void cappuccinoZubereiten();
    void wasserAuffuellen();
    void bohnenAuffuellen();
    void koffeinhaltigesGetraenkAuswaehlen();
    void koffeinhaltigesGetraenkZubereiten(KoffeinhaltigesGetraenk koffeinhaltigesGetraenk);
}
