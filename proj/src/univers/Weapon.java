package univers;

public class Weapon{
	private String name;
	public int order;
	
	public Weapon(String n) {
		name = n;
	}
	
	public void addorder(String[] W) {
		for (int i=0; i<W.length;i++) {
			if (W[i] == this.name) {
				this.order = i;
			}
		}
	}
	
	public String getName() {
		return this.name;
	}
	
}

//import java.lang.Enum;

/*public class Weapon {
	private enum W{
		POINGS, POIGNARD, PISTOLET, BAYONETTE, MANCHETTE, FUSIL
	};
	public int order;
	
	public void addorder() {
		int i = 0;
		for (W w : W.values()) {
			this.order = i++;
		}
	}
	
	public static void main(String[] args) {
		W weapon = W.POIGNARD;
		
		weapon.addorder();
		
		System.out.println(weapon.order);
	}
	
	
}*/
