package representation;

/** 
 * Classe abstraite des noeuds decorateurs
 * @author Baptiste Geisenberger 
 */
public abstract class NodeDecorator implements Event{
	
	public abstract void display();
	
	public abstract Event choosenext();
}
