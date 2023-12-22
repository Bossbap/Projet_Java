package representation;


/**
 * Event est une interface qui regroupe les noeuds du jeu et les noeuds decorateur. Cette interface permet de suivre des evenements in-game ainsi que des evenementsn de decoration.
 * @author Baptiste Geisenberger
 */
public interface Event{
	
	/** 
	 * Decrit ou bien l'etape a laquelle se trouve un joueur, ou bien affiche une decoration
	 */
	public void display();
	
	/** 
	 * Renvoie au prochain stage de la partie
	 * @return le prochain noeud qui represente ce prochain stage.
	 */
	public Event choosenext();
	
}
