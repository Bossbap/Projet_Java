package univers;

public abstract class Groupe {
	protected String name;
	protected int cash;
	protected String intro;
	protected Weapon weapon;
	
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
	
	public void varc(int c) {
		this.cash = this.cash + c;
	}
	
	public abstract void presentation();
	
}
