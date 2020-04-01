package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.ausgang;

public class SchwarzerEspresso implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso";
	}

	public int getPreis() {
		return 50;
	}

}