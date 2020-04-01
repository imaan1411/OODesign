package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class EntkoffeinierterKaffeeMitZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Zucker, ohne Koffein";
	}

	public int getPreis() {
		return 120;
	}

}