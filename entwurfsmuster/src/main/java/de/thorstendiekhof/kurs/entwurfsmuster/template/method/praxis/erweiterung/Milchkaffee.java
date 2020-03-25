package de.thorstendiekhof.kurs.entwurfsmuster.template.method.praxis.erweiterung;



public class Milchkaffee extends Kaffeespezialitaet {

	@Override
	void mahleBohnen() {
		mahleBohnen(12);
	}

	@Override
	void bereiteMilschschaum() {
		bereiteMilchschaum(10);
	}

	@Override
	void brueheKaffee() {
		brueheKaffee(200);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
		reinigeMilchduese();
	}

}