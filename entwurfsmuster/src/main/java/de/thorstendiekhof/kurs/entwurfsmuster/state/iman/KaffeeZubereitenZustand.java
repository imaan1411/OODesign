package de.thorstendiekhof.kurs.entwurfsmuster.state.iman;

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
        // naming checkIfMaschineBereit (bohnen und wasser)
        if (checkIfMaschineBereit()) {
            new Cappuccino().zubereiten();
            kaffeeMaschine.wasserInMl--;
            kaffeeMaschine.anzahlBohnen--;
        }
        // else ?
    }

    @Override
    public void espressoZubereiten() {

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
        if (0 == kaffeeMaschine.anzahlBohnen) {
            kaffeeMaschine.zustand = kaffeeMaschine.keineBohnenZustand;
            return false;
        } else if (0 == kaffeeMaschine.wasserInMl) {
            kaffeeMaschine.zustand = kaffeeMaschine.keinWasserZustand;
            return false;
        }
        return true;
    }

}
