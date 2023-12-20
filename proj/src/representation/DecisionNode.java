package representation;

import java.util.Scanner;

public class DecisionNode extends InnerNode{
	
	public static Scanner s;
		
	public DecisionNode(String description) {
		super(description);
	}
	
	@Override
	public Node choosenext() {
		if (N.length == 1) {
			return this.N[0];
		}
		int c = DecisionNode.s.nextInt();
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
