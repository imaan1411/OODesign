package de.thorstendiekhof.kurs.entwurfsmuster.state.praxis.erweiterung;

public class KaffeeZubereitenZustand implements Zustand {
    private KaffeeAutomat automat;

	public KaffeeZubereitenZustand(KaffeeAutomat automat){
        this.automat = automat;
    }

	public void kaffeeAuswaehlen() {
		System.out.println("Bitte warten Sie. Ein Kaffee wird aktuell zubereitet.");
	}

	public void espressoAuswaehlen() {
		System.out.println("Bitte warten Sie. Ein Kaffee wird aktuell zubereitet.");
	}

	public void kaffeeBereiten() {
		automat.bohnen --;
        System.out.println("Bereite Kaffee zu...");
        automat.simuliereHardware();
        System.out.println("Bitte sehr! Kaffee zubereitet.");
        if(automat.bohnen < 1)
            automat.zustand = automat.bohnenLeerZustand;
        else automat.zustand = automat.keinGeldEingeworfenZustand;
	}

	public void espressoBereiten() {
	}

	public void bohnenAuffuellen() {
        automat.bohnen = automat.maxBohnen;
        System.out.println("Bohnen sind wieder voll.");
	}

	public void geldEinwerfen() {
		System.out.println("–Geld wird nicht angenommen–");
		System.out.println("Bitte warten Sie. Ein Kaffee wird aktuell zubereitet.");
	}

}