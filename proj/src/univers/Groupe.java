package univers;

import java.io.Serializable;

/** 
 * Entite de personnes(s)
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public abstract class Groupe implements Serializable{
	protected String name;
	protected int cash;
	protected String intro;
	protected Weapon weapon;
	
	/**
	 * Constructeur de groupe
	 * @param n nom du groupe
	 * @param c argent du groupe
	 * @param in introduction du groupe
	 * @param w arme du groupe
	 */
	public Groupe(String n, int c, String in, Weapon w) {
		name = n;
		cash = c;
		intro = in;
		weapon = w;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	
	public int getCash() {
		return this.cash;
	}
	
	/** 
	 * Presente l'entite (que ce soit un gang, un personnage ou le personnage principal)
	 */
	public abstract void presentation();
	
}
