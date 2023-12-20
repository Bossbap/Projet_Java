package representation;


/**Event is an interace that links the classes Nodes to the class NodeDecorator. It allows for Nodes to display an image/sound when being displayed.
 * @author Baptiste Geisenberger
 */
public interface Event {
	
	/** describes the stage of the game the player is at with a text and/or image and/or sound
	 */
	public void display();
	
	/** chooses the next stage of the game
	 * @return the next node that represents the stage of the game
	 */
	public Event choosenext();
	
}
