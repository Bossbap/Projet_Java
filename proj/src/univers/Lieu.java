package univers;

public class Lieu {
	private String name;
	private boolean reduit;
	
	public Lieu(String n, boolean r) {
		name = n;
		reduit = r;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getReduit() {
		return this.reduit;
	}
}
