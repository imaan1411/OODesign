package de.thorstendiekhof.kurs.entwurfsmuster.observer.praxis.ausgang;

public interface Subjekt {
    void registriereBeobachter(Beobachter beobachter);
    void entferneBeobachter(Beobachter beobachter);
    void aktualisiereBeobachter(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte);
}