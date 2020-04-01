package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.ausgang;

public class KaffeeMitMilchUndZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Milch, mit Zucker";
	}

	public int getPreis() {
		return 130;
	}

}