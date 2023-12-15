package representation;

import java.util.Scanner;

public class TerminalNode extends Node{
	
	public TerminalNode(String description) {
		super(description);
	}
	
	public Node choosenext() {
		return this;
	}
	
	public void setScan(Scanner scanner) {
	}
}
