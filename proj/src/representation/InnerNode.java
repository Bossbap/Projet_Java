package representation;

import univers.Lieu;
import univers.Objet;

/** 
 * Represente tous les noeuds qui ne sont pas terminaux
 * @author Baptiste Geisenberger
 */
@SuppressWarnings("serial")
public class InnerNode extends Node{
		
	public InnerNode(String description) {
		super(description);
	}
	
	/** 
	 * Choisis le prochain noeud lorsque ce choix n'est ni base sur la decision de l'utilisateur, ni sur l'aleatoire. C'est alors par rapport aux parametres actuels du package univers dans l'histoire courrante.
	 */
	
	public Event choosenext() {
		if (id == 16) {
			if (Node.p.getAllie().getName().equals("Chantal")) {
				return N.get(0);
			}
		}
		if (id == 17) {
			if (Node.p.getAllie().getName().equals("Les freres Gilbert")) {
				return N.get(0);
			}
		}
		if (id == 18) {
			if (Node.p.getAllie().getName().equals("Dominique Apagnan")) {
				return N.get(0);
			}
		}
		if (id == 31) {
			Lieu c = new Lieu("Clairiere",false);
			if (p.getWeapon().fight(mapOpp.get(1).getWeapon(), c)){
				System.out.println("\nTon arme était plus efficace et tu remportes le combat. Tu as gagné ton duel!");
				return N.get(0);
			}
			if (p.getAllie().getWeapon().fight(mapOpp.get(1).getWeapon(), c)) {
				System.out.println("\nL'arme de " + Node.p.getAllie().getName() + " etait plus efficace et tu remportes le combat, tu peux remercier ton compagnon. Tu as gagné ton duel!");
				return N.get(0);
			}
		}
		if (id == 44) {
			Lieu c = new Lieu("Tunnel",true);
			if (p.getWeapon().fight(mapOpp.get(2).getWeapon(), c)){
				System.out.println("\nTon arme était plus efficace et tu remportes le combat. Tu as gagné ton duel!");
				return N.get(0);
			}
			if (p.getAllie().getWeapon().fight(mapOpp.get(2).getWeapon(), c)) {
				System.out.println("\nL'arme de " + Node.p.getAllie().getName() + " etait plus efficace et tu remportes le combat, tu peux remercier ton compagnon. Tu as gagné ton duel!");
				return N.get(0);
			}
		}
		if (id == 50) {
			if (Objet.alu) {
				return N.get(0);
			}
		}
		return N.get(1);
	}
}
