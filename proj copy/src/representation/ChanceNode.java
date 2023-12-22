package representation;

import java.util.Random;

/** 
 * ChanceNoeud est un stade de la partie ou l'utilisateur n'a pas d'influence, car le prochain noeud qui en decoule est aleatoire.
 * @author Baptiste Geisenberger
 */
@SuppressWarnings("serial")
public class ChanceNode extends InnerNode{
	
	public ChanceNode(String description) {
		super(description);
	}
	
	/**
	 * Cette implementation de choosenext produit un evenement aleatoire, et en fonction de cet evenement renvoie un noeud.
	 */
	@Override
	public Event choosenext() {
		if (this.id == 30) {
			Random r = new Random();
			boolean rrusse = r.nextBoolean();
			if (rrusse) {
				return N.get(0);
			}
		}
		if (this.id == 49) {
			Random r2 = new Random();
			int gob = r2.nextInt(3);
			if (gob == 1) {
				return N.get(0);
			}
		}
		return N.get(1);
	}
	
}
