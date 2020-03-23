package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.ausgang;

public class Ritter extends Einheit {
	public Ritter(){
		bewegungsverhalten = new ReitVerhalten();
		angriffsverhalten = new SchwertVerhalten();
	}
}