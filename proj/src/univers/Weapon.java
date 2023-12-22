package univers;

import java.io.Serializable;

/** 
 * Classe abstraite Weapon qui regroupe les armes a courte et longue portee
 * @author Hector Moreau
 */
@SuppressWarnings("serial")
public abstract class Weapon implements Serializable{
	protected String name;
	protected int order;
	
	public String getName() {
		return this.name;
	}
	
	public int getOrder() {
		return this.order;
	}
	
	public abstract boolean fight(Weapon w, Lieu l);	
}