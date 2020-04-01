package de.thorstendiekhof.kurs.entwurfsmuster.decorator.praxis.ausgang;

public class Kaffee extends Kaffeespezialitaet {

    public Kaffee(){
        beschreibung = "Ein Kaffee";
	}
	
	@Override
	int getPreis() {
		return 100;
	}

}