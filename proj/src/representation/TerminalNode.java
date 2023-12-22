package representation;

/** 
 * TerminalNode represente un noeud de fin de partie
 * @author Baptiste Geisenberger
 */
@SuppressWarnings("serial")
public class TerminalNode extends Node{
	
	public TerminalNode(String description) {
		super(description);
	}
	
	/** 
	 * Renvoie lui meme.
	 */
	public Node choosenext() {
		return this;
	}
}
