package representation;

import java.util.HashMap;
import java.util.List;
import univers.*;
import java.io.Serializable;

/**Loader permet de charger une partie anciennement sauvegarder
 * @author Baptiste Geisenberger
 */
@SuppressWarnings("serial")
public abstract class Node implements Event, Serializable{
	private String description;
	/** 
	 * Represente le nombre de noeuds dans la partie
	 */
	public static int nbnoeuds;
	/**
	 *  Attribue un identifiant a chaque noeud 
	 */
	public final int id;
	/** 
	 * Liste des noeuds fils
	 */
	public List<Event> N;
	/** 
	 * Premier noeud de l'histoire
	 */
	public static Event premier;
	/** 
	 * Personnage principal de l'histoire 
	 */
	public static Principal p;
	/** 
	 * Tous les alliees possible
	 */
	public static HashMap<Integer, Groupe> mapAllie = new HashMap<>();
	/** 
	 * Tous les ennemis possibles
	 */
	public static HashMap<Integer, Groupe> mapOpp = new HashMap<>();
	/** 
	 * Toutes les armes possible 
	 */
	public static HashMap<Integer, Weapon> mapW = new HashMap<>();
	
	public Node(String description) {
		this.id = nbnoeuds++;
		this.description = description;
	}
	
	public String getDesc() {
		return description;
	}
	
	/** 
	 * Attribue la liste de fils au noeud
	 */
	public void setNodes(List<Event> nlist) {
		this.N = nlist;
	}
	
	public void display() {
		System.out.println(this.description);
	}
	
	/** 
	 * Implementation de equals qui permet de comparer de noeuds selon leur id
	 */
	@Override
	public boolean equals(Object other) {
		if (other == null || this.getClass() != other.getClass()) {
			return false;
		}
		
		Node ot = (Node) other;
		return this.id == ot.id;
	}
	
	public abstract Event choosenext();
		
}
