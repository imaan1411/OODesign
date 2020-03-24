package de.thorstendiekhof.kurs.entwurfsmuster.state.iman.v2;

public class BohnenLeerZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public BohnenLeerZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void cappuccinoAuswaehlen() {
        System.out.println("Du kannst keinen Cappuccino auswählen. Die Bohnen sind leer!");
    }

    @Override
    public void cappuccinoZubereiten() {
    }

    @Override
    public void wasserAuffuellen() {
        System.out.println("Die Bohnen sind leer! Nicht das Wasser...");
    }

    @Override
    public void bohnenAuffuellen() {
        System.out.println("Die Bohnen sind wieder voll!");
        this.kaffeeMaschine.anzahlBohnen += 3;
        this.kaffeeMaschine.zustand = this.kaffeeMaschine.wartenAufAuswahlZustand;
    }
}
