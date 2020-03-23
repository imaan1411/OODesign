package de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v1;

import java.util.ArrayList;
import java.util.List;

public class Ritter implements Subjekt {
    private int lebenspunkte;
    private List<Beobachter> beobachter = new ArrayList<>();

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    @Override
    public void entferneBeobachter(Beobachter beobachter) {
        this.beobachter.remove(beobachter);
    }

    @Override
    public void benachrichtigeBeobachter(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
        this.beobachter.forEach(b -> b.aktualisiere(lebenspunkte));

    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

}
