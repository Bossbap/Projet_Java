package univers;

public class Gang extends Groupe{
	private Perso boss;
	
	public Gang(String n, int c, String in) {
		super(n,c,in);
	}
	
	public void addboss(Perso b) {
		this.boss = b;
	}
	
	public void presentation() {
		System.out.println(this.intro);
		System.out.println("Nom de notre groupe: " + this.name);
		System.out.println("Nom de notre boss: " + this.boss.getName());
	}
}
