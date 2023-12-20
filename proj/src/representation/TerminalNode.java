package representation;

public class TerminalNode extends Node{
	
	public TerminalNode(String description) {
		super(description);
	}
	
	public Node choosenext() {
		return this;
	}
}
