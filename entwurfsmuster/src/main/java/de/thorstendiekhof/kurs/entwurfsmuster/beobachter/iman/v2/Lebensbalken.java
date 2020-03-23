package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman.v2;

import java.util.Observable;
import java.util.Observer;

public class Lebensbalken implements Observer {
    private int lebenspunkte;

    @Override
    public void update(Observable o, Object arg) {
        Drache d = (Drache) o;
        this.lebenspunkte = d.getLebenspunkte();
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

}
