package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.erweiterung;

public class Zauberer extends Einheit {

	public Zauberer(){
		bewegungsverhalten = new ZuFussVerhalten();
		zauberverhalten = new SchafzauberVerhalten();
	}
	

}