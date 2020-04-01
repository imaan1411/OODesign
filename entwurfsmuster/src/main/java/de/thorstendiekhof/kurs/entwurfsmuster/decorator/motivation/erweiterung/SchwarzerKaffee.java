package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class SchwarzerKaffee implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee";
	}

	public int getPreis() {
		return 100;
	}

}