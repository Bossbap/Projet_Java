package univers;

import java.util.Random;
import java.io.Serializable;

/** Armes de courte portee
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public class Weapons extends Weapon implements Serializable{
	private Wshort weapon;
	private int order;
	
	/** definit les armes de courte portee
	 * @param n nom de l'arme
	 */
	public Weapons(String n) {
		try {
			this.weapon = Wshort.valueOf(n.toUpperCase());
			this.name = n;
		}catch (IllegalArgumentException e) {
			this.weapon = Wshort.POINGS;
			this.name = "Poings";
		}
		switch(weapon) {
		case POINGS:
			order = 0;
		case POING_AMERICAIN:
			order = 1;
		case POIGNARD:
			order = 2;
		case MACHETTE:
			order = 3;
		case EPEE:
			order = 4;
		}
	}
	
	public int getOrder() {
		return this.order;
	}
	
	/**
	 * Comme Weaponl dans l'autre sens
	 */
	public boolean fight(Weapon w, Lieu l) {
		if (w instanceof Weapons) {
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
				return true;
			}
			else {
				return false;
			}
		}
	}
}
