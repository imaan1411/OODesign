package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.erweiterung;

public class Handelskarren extends Einheit {

	public Handelskarren(){
		bewegungsverhalten = new ReitVerhalten();
	}

}