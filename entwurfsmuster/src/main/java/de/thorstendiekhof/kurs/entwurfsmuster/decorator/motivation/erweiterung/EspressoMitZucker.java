package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class EspressoMitZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso, mit Zucker";
	}

	public int getPreis() {
		return 60;
	}

}