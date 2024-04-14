package univers;

import java.io.Serializable;


/** 
 * Represente un personnage
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public class Perso extends Groupe implements Serializable{
	
	public Perso(String n, int c, String in, Weapon w) {
		super(n,c,in,w);
	}
	

	public void presentation() {
		System.out.println(this.intro);
		System.out.println("Nom: "+ this.name);
		System.out.println("Arme: " + this.weapon.getName());
		System.out.println("Cash: "+this.getCash() + " Francs");
	}
	
}
