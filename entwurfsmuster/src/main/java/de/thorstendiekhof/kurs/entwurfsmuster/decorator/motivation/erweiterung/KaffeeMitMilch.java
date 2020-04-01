package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class KaffeeMitMilch implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Milch";
	}

	public int getPreis() {
		return 120;
	}

}