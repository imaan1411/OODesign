package de.thorstendiekhof.kurs.entwurfsmuster.strategy.motivation.erweiterung2;

public class Handelskarren implements Einheit,Bewegend {

	public void bewegen() {
		System.out.println("Bewegt sich beritten.");
	}

}