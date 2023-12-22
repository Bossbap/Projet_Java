package univers;

import java.io.Serializable;


/** 
 * Represente un personnage
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public class Perso extends Groupe implements Serializable{
	protected Perso boss;
	
	public Perso(String n, int c, String in, Weapon w) {
		super(n,c,in,w);
	}
	
	public void addboss(Perso b) {
		this.boss = b;
	}

	public void presentation() {
		System.out.println(this.intro);
		System.out.println("Nom: "+ this.name);
		System.out.println("Arme: " + this.weapon.getName());
		System.out.println("Cash: "+this.getCash() + " Francs");
		if (boss == null) {
			System.out.println("Boss: Aucun");
		}
		else {
			System.out.println("Boss: " + this.boss.getName());
		}
	}
	
}
