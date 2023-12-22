package univers;

import java.util.Random;
import java.io.Serializable;

/** 
 * Armes de longue portee
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public class Weaponl extends Weapon implements Serializable{
	private Wlong weapon;
	private int order;
	
	/** 
	 * Definit les armes de longue portee en fonction de l'enum Weaponl
	 * @param n nom de l'arme
	 */
	public Weaponl(String n) {
		try {
			this.weapon = Wlong.valueOf(n.toUpperCase());
			this.name = n;
		}catch (IllegalArgumentException e) {
			this.weapon = Wlong.COUTEAU_DE_LANCER;
			this.name = "Couteau_de_Lancer";
		}
		switch(weapon) {
		case COUTEAU_DE_LANCER:
			order = 0;
		case SARBACANE:
			order = 1;
		case PISTOLET:
			order = 2;
		case CARABINE:
			this.order = 3;
		}
		this.name = n;
	}
	
	public int getOrder() {
		return this.order;
	}
	
	/** Combat entre deux armes
	 * @param w arme adverse
	 * @param l lieu reduit ou non impacte la bataille
	 * @return si cette arme a gagne (true) ou perdu (false)
	 */
	public boolean fight(Weapon w, Lieu l) {
		if (w instanceof Weaponl) {
			if (this.order>w.order) {
				return true;
			}
			if (this.order<w.order) {
				return false;
			}
			else{
				Random r = new Random();
				boolean isWinner = r.nextBoolean();
				return isWinner;
			}
		}
		else{
			if (l.getReduit()){
				return false;
			}
			else {
				return true;
			}
		}
	}
}
