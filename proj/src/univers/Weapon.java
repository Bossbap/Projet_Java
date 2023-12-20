package univers;

public abstract class Weapon {
	protected String name;
	protected int order;
	
	public String getName() {
		return this.name;
	}
	
	public int getOrder() {
		return this.order;
	}
	
	public abstract boolean fight(Weapon w, Lieu l);	
}