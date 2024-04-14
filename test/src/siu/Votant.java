package siu;
import java.util.Random;

public class Votant {
	private String nom;
	private Votant delegation;
	private int poids;
	private double precision;
	private int delDist;
	private static int nbVotants;
	private final int ID = nbVotants++;
	private static Random r = new Random();
	
	public Votant() {
		nom = "Votant" + ID;
		delDist = r.nextInt(0,4);
	}
	
}
