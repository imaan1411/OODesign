package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman;

public class Lebensbalken implements Beobachter {
    private int lebenspunkte;

    @Override
    public void aktualisiere(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}
