package de.thorstendiekhof.kurs.entwurfsmuster.strategy.motivation.erweiterung;

public class Handelskarren implements Einheit {

	public void bewegen() {
		System.out.println("Bewegt sich beritten.");
	}

	public void angreifen() {
		throw new UnsupportedOperationException();
	}

}