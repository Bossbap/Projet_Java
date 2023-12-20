package representation;

public class InnerNode extends Node{
		
	public InnerNode(String description) {
		super(description);
	}
	
	public Node choosenext() {
		if (this.id == 16) {
			if (Node.p.getAllie().getName().equals("Chantal")) {
				return N[0];
			}
		}
		if (this.id == 17) {
			if (Node.p.getAllie().getName().equals("Les freres Gilbert")) {
				return N[0];
			}
		}
		if (this.id == 18) {
			if (Node.p.getAllie().getName().equals("Dominique Apagnan")) {
				return N[0];
			}
		}
		if (this.id == 16) {
			if (Node.p.getAllie().getName() == "Chantal") {
				return N[0];
			}
		}
		if (this.id == 16) {
			if (Node.p.getAllie().getName() == "Chantal") {
				return N[0];
			}
		}
		if (this.id == 16) {
			if (Node.p.getAllie().getName() == "Chantal") {
				return N[0];
			}
		}
		return N[1];
	}
}
