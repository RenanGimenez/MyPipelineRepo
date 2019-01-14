package main;

public class Compteur {
	private int cpt;

	public Compteur() {
		super();
		this.cpt = 0;
	}
	
	public int increment() {
		return ++cpt;
	}
	
	public int decrement() {
		return --cpt;
	}
	
	public int getValue() {
		return cpt;
	}
}
