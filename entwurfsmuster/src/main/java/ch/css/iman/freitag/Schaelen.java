package ch.css.iman.freitag;

public class Schaelen implements Essen {

    @Override
    public void kochen() {
        System.out.println("Du schälst jetzt " + Kartoffeln.KARTOFFELN);
    }
}
