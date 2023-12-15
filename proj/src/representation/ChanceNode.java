package representation;

import java.util.Scanner;

public class ChanceNode extends InnerNode{
	
	public ChanceNode(String description) {
		super(description);
	}
	
	public Node choosenext() {
		return this;
	}
	
	public void setScan(Scanner scanner) {
	}
	
}
