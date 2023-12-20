package univers;

import java.util.Random;

public class Weaponl extends Weapon{
	private Wlong weapon;
	private int order;
	
	public Weaponl(String n) {
		try {
			this.weapon = Wlong.valueOf(n.toUpperCase());
			this.name = n;
		}catch (IllegalArgumentException e) {
			this.weapon = Wlong.CARABINE;
			this.name = "Carabine";
		}
		switch(weapon) {
		case COUTEAU_DE_LANCER:
			order = 0;
		case SARBACANE:
			order = 1;
		case PISTOLET:
			order = 2;
		case CARABINE:
			order = 3;
		}
		name = "";
	}
	
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
