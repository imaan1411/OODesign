package de.thorstendiekhof.kurs.entwurfsmuster.template.method.praxis.erweiterung;



public class Kaffee extends Kaffeespezialitaet {


	@Override
	void mahleBohnen() {
		mahleBohnen(12);
	}

	@Override
	void bereiteMilschschaum() {
		
	}

	@Override
	void brueheKaffee() {
		brueheKaffee(200);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
	}

}