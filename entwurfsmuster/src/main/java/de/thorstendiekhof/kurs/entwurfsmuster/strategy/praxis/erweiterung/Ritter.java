package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.erweiterung;

public class Ritter extends Einheit {

	public Ritter(){
		bewegungsverhalten = new ReitVerhalten();
		angriffsverhalten = new SchwertVerhalten();
	}

}