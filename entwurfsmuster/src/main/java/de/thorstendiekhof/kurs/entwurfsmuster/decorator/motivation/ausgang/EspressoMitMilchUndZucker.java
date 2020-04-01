package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.ausgang;

public class EspressoMitMilchUndZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso, mit Milch, mit Zucker.";
	}

	public int getPreis() {
		return 80;
	}

}