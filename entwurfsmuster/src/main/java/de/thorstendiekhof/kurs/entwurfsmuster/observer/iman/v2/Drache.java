package de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v2;

import java.util.Observable;

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
