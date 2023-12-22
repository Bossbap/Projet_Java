package univers;

import java.io.Serializable;

/** 
 * Represente un Lieu dans l'histoire
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public class Lieu implements Serializable{
	private String name;
	private boolean reduit;
	
	/** 
	 * Constructeur du lieu
	 * @param n nom du lieu
	 * @param r indique si le lieu est reduit ou pas (dans une salle ferme ou dehors)
	 */
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
