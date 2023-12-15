package univers;

public class Perso extends Groupe{
	private Weapon weapon;
	private Perso boss;
	
	public Perso(String n, int c, String in) {
		super(n,c,in);
		weapon = null;
		boss = null;
	}
	
	public void addboss(Perso b) {
		this.boss = b;
	}
	
	public void addweapon(Weapon w) {
		this.weapon = w;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void presentation() {
		System.out.println(this.intro);
		System.out.println("Je m'appelle "+this.name);
		if (weapon == null) {
			System.out.println("Voici mon arme: POINGS");
		}
		else {
			System.out.println("Voici mon arme: " + this.weapon);
		}
		if (boss == null) {
			System.out.println("Votre boss: toi et toi uniquement");
		}
		else {
			System.out.println("Votre boss: " + this.boss.getName());
		}
	}
	
	public int dispcash() {
		return this.cash;
	}
	
	public void cashop(int c) {
		this.cash = this.cash + c;
	}
	
}
