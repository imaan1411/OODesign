package de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v1;

public class Lebensbalken implements Beobachter {
    private int lebenspunkte;

    @Override
    public void aktualisiere(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

}
