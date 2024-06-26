package univers;
import java.io.Serializable;

/** 
 * Represente un groupe de personnages
 * @author Hector Moreau
 */

@SuppressWarnings("serial")
public class Gang extends Groupe implements Serializable{
	private Perso boss;
	
	public Gang(String n, int c, String in, Perso b, Weapon w) {
		super(n,c,in,w);
		this.boss = b;
	}
	
	public void presentation() {
		System.out.println(this.intro);
		System.out.println("Nom de notre groupe: " + this.name);
		System.out.println("Nom de notre boss: " + this.boss.getName());
		System.out.println("Notre arme: " + this.getWeapon().getName() + " tu peux l'utiliser dans tout tes combats");
	}
}
	
