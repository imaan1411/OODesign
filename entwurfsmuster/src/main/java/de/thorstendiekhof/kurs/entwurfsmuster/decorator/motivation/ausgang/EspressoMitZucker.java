package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.ausgang;

public class EspressoMitZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso, mit Zucker";
	}

	public int getPreis() {
		return 60;
	}

}