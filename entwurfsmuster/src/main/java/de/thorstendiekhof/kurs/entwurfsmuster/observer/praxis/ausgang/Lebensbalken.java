package de.thorstendiekhof.kurs.entwurfsmuster.observer.praxis.ausgang;

public class Lebensbalken implements Beobachter {
    public void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
        System.out.println("Leben: " + neueLebenspunkte + "/" + maxLebenspunkte);
	}
}