package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman.v1;

public interface Subjekt {
    void registriereBeobachter(Beobachter beobachter);
    void entferneBeobachter(Beobachter beobachter);
    void benachrichtigeBeobachter(int lebenspunkte);
}
