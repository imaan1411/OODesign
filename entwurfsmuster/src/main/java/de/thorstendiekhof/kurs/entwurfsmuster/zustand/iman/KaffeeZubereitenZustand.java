package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeZubereitenZustand implements Zustand {
    private KaffeeMaschine kaffeeMaschine;

    public KaffeeZubereitenZustand(KaffeeMaschine kaffeeMaschine) {
        this.kaffeeMaschine = kaffeeMaschine;
    }

    @Override
    public void warten() {
        System.out.println("Kaffee wird zubereitet!");
    }

    @Override
    public void cappuccinoZubereiten() {
        if (checkIfMaschineBereit()) {
            new Cappuccino().zubereiten();
            kaffeeMaschine.zustand.warten();
        }
    }

    @Override
    public void espressoZubereiten() {
        if (kaffeeMaschine.anzahlBohnen == 0) {
            kaffeeMaschine.zustand = kaffeeMaschine.keineBohnenZustand;
        }


            new Espresso().zubereiten();
            kaffeeMaschine.zustand.warten();

    }

    @Override
    public void keineBohnen() {
        kaffeeMaschine.zustand = kaffeeMaschine.keineBohnenZustand;
    }

    @Override
    public void keinWasser() {
        kaffeeMaschine.zustand = kaffeeMaschine.keinWasserZustand;
    }

    private boolean checkIfMaschineBereit() {
        if (kaffeeMaschine.anzahlBohnen == 0) {
            kaffeeMaschine.zustand = kaffeeMaschine.keineBohnenZustand;
            return false;
        } else if (kaffeeMaschine.wasserInMl == 0) {
            kaffeeMaschine.zustand.keinWasser();
            return false;
        }
        return true;
    }

}
