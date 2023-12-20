package univers;

import java.util.Random;

public class Weapons extends Weapon{
	private Wshort weapon;
	private int order;
	
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
		case SABRE:
			order = 4;
		}
	}
	
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
