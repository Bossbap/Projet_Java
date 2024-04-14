package siu;

import java.util.Random;

public class Personne {
	private String nom;
	private int pos;
	private static Random r = new Random();
	
	public Personne(String n) {
		nom = n;
		pos = r.nextInt(0,11);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPos() {
		return pos;
	}
}
