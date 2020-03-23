package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman.v2;

import java.util.Observable;
import java.util.Observer;

public class Drache extends Observable {
    private int lebenspunkte;

    public void benachrichtigeObserver(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
        setChanged();
        notifyObservers();
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

}
