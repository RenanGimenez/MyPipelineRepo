package main;

public class Main {
	public static void main(String[] args) {
		Compteur cpt = new Compteur();
		System.out.println(cpt.getValue());
		System.out.println(cpt.increment());
		System.out.println(cpt.increment());
		System.out.println(cpt.increment());
		System.out.println(cpt.decrement());
		System.out.println(cpt.increment());
	}
}
