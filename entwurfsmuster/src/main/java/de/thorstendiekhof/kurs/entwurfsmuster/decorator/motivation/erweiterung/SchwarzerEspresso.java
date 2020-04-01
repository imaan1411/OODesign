package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class SchwarzerEspresso implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso";
	}

	public int getPreis() {
		return 50;
	}

}