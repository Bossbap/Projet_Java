package univers;

public class Principal{
	private String name;
	private int cash;
	private Weapon weapon;
	private int moralpt;
	private Perso boss;
	
	public Principal(String n) {
	name = n;
	cash = 100;
	moralpt = 5;
	weapon = null;
	boss = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addweapon(Weapon w) {
		this.weapon = w;
	}
	
	public void addboss(Perso b) {
		this.boss = b;
	}
	
	public void presprinc() {
		System.out.println("Votre nom: " + this.name);
		System.out.println("Votre fric: " + this.cash + " francs");
		System.out.println("Vos points moraux: " + this.moralpt);
		if (weapon == null) {
			System.out.println("Votre arme: poings");
		}
		else {
			System.out.println("Votre boss: " + this.boss.getName());
		}
		if (boss == null) {
			System.out.println("Votre boss: toi et toi uniquement");
		}
		else {
			System.out.println("Votre boss: " + this.boss.getName());
		}
	}
	
	public void varmp(int m) {
		if (m<0) {
			System.out.println("Vous avez perdu "+ (-m) + " points moraux");
		}
		else {
			System.out.println("Vous avez gagne "+ m + " points moraux");
		}
		moralpt = moralpt + m;
		System.out.println("Vous avez maintenant " + this.moralpt + "points moraux");
	}
	
	public void varc(int c) {
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
		System.out.println("Changement d'arme!\nAncienne arme: "+weapon+"\nNouvelle arme: "+w);
		this.weapon = w;
	}
	
	public void presentation() {
		System.out.println();
	}
}
