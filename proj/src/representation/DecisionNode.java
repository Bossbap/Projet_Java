package representation;

import java.util.Scanner;

public class DecisionNode extends InnerNode{
	
	private Scanner s;
	
	public void setScan(Scanner scanner) {
		this.s = scanner;
	}
		
	public DecisionNode(String description) {
		super(description);
	}
	
	public Node choosenext() {
		if (N.length == 1) {
			return this.N[0];
		}
		int c = this.s.nextInt();
		while (true) {
			for (int i = 0; i<this.N.length;i++) {
				if (i+1 == c) {
					return this.N[i];
				}
			}
			System.out.println("Votre decision n'est pas dans les choix, veuillez entrer une decision correcte.");
			c = s.nextInt();
		}
	}
}
