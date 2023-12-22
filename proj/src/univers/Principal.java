package univers;
import java.io.Serializable;

/**
* @author Hector Moreau
*/
@SuppressWarnings("serial")
public class Principal extends Perso implements Serializable{
	private int moralpt;
	private Groupe allie;
	public boolean vivant = true;
	
	public Principal(String n, Weapon w) {
		super(n,100,"PROFIL",w);
		moralpt = 5;
		allie = null;
	}
	
	public Groupe getAllie() {
		return this.allie;
	}
	
	public int getMoralpt() {
		return this.moralpt;
	}
	
	@Override
	public void presentation() {
		super.presentation();
		System.out.println("Points moraux: " + this.getMoralpt());
		if (allie == null) {
			System.out.println("Allie: Aucun");
		}
		else {
			System.out.println("Allie: " + this.allie.getName());
		}
	}
	
	public void varw(Weapon w) {
		this.weapon = w;
	}
	
	public void addAllie(Groupe a) {
		this.allie = a;
	}
	
	/** 
	 * Change les points moraux
	 * @param m nombre de points moraux a ajouter au nombre actuel
	 */
	public void varmp(int m) {
		System.out.println("");
		if (m<0) {
			System.out.println("Tu as perdu "+ (-m) + " points moraux. Tu as maintenant " + (this.moralpt + m) + " points moraux");
		}
		else {
			System.out.println("Tu as gagne "+ m + " points moraux. Tu as maintenant " + (this.moralpt + m) + " points moraux");
		}
		moralpt = moralpt + m;
	}
	
	/** 
	 * Change le cash
	 * @param c nombre de francs a ajouter au nombre actuel
	 */
	public void varc(int c) {
		System.out.println("");
		if (c<0) {
			System.out.println("Tu as perdu "+ (-c) + " francs. Tu as maintenant " + (this.cash + c) + " francs");
		}
		else {
			System.out.println("Tu as gagne "+ c + " francs. Tu as maintenant " + (this.cash + c) + " francs");
		}
		cash = cash + c;
	}
	
	/** 
	 * Change le cash sans afficher (Utiliser pour sauvegarder les parties afin de revenir a un personnage principal de base).
	 * @param c nombre de francs a ajouter au nombre actuel
	 */
	public void varc_silent(int c) {
		cash = cash+c;
	}
	
	/** 
	 * Change les points moraux sans afficher (Utiliser pour sauvegarder les parties afin de revenir a un personnage principal de base).
	 * @param m nombre de points moraux a ajouter au nombre actuel
	 */
	public void varmp_silent(int m) {
		moralpt = moralpt+m;
	}
}
