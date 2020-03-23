package de.thorstendiekhof.kurs.entwurfsmuster.observer.praxis.ausgang;

public interface Beobachter {
    void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte);
}