package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class EntkoffeinierterKaffeeMitMilch implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Milch, ohne Koffein";
	}

	public int getPreis() {
		return 130;
	}

}