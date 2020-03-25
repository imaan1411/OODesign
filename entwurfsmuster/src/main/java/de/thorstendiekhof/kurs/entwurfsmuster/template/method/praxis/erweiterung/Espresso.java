package de.thorstendiekhof.kurs.entwurfsmuster.template.method.praxis.erweiterung;



public class Espresso extends Kaffeespezialitaet{

	@Override
	void mahleBohnen() {
		mahleBohnen(9);
	}

	@Override
	void bereiteMilschschaum() {
	}

	@Override
	void brueheKaffee() {
		brueheKaffee(30);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
	}
    
}