package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.erweiterung;

public class Bogenschuetze extends Einheit {

	public Bogenschuetze(){
		bewegungsverhalten = new ZuFussVerhalten();
		angriffsverhalten = new BogenVerhalten();
	}

}