package de.thorstendiekhof.kurs.entwurfsmuster.strategy.praxis.ausgang;

public class ZuFussVerhalten implements Bewegungsverhalten {
	public void bewegen() {
		System.out.println("Bewegt sich zu Fuß.");
	}
}