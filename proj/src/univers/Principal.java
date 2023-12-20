package univers;

public class Principal extends Perso{
	private int moralpt;
	private Allie allie;
	public boolean vivant = true;
	
	public Principal(String n, Weapon w) {
		super(n,100,"PROFIL",w);
		moralpt = 5;
		allie = null;
	}
	
	public void changeWeapon(Weapon w) {
		this.weapon = w;
	}
	
	public Allie getAllie() {
		return this.allie;
	}
	
	public int getMoralpt() {
		return this.moralpt;
	}
	
	public void addAllie(Allie a) {
		this.allie = a;
	}
	
	@Override
	public void presentation() {
		super.presentation();
		System.out.println("Vos points moraux: " + this.getMoralpt());
		if (allie == null) {
			System.out.println("Allie: Aucun");
		}
		else {
			System.out.println("Allie: " + this.allie.getName());
		}
	}
	
	public void varmp(int m) {
		System.out.println("");
		if (m<0) {
			System.out.println("Vous avez perdu "+ (-m) + " points moraux");
		}
		else {
			System.out.println("Vous avez gagne "+ m + " points moraux");
		}
		moralpt = moralpt + m;
		System.out.println("Vous avez maintenant " + this.moralpt + " points moraux");
	}
	
	@Override
	public void varc(int c) {
		System.out.println("");
		if (c<0) {
			System.out.println("Vous avez perdu "+ (-c) + " francs");
		}
		else {
			System.out.println("Vous avez gagne "+ c + " francs");
		}
		cash = cash + c;
		System.out.println("Vous avez maintenant " + this.cash + "francs");
	}
	
	public void varw(Weapon w) {
		weapon = w;
	}
}
