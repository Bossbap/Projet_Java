package representation;

import java.util.Random;


public class ChanceNode extends InnerNode{
	
	public ChanceNode(String description) {
		super(description);
	}
	
	@Override
	public Node choosenext() {
		if (this.id == 30) {
			Random r = new Random();
			boolean rrusse = r.nextBoolean();
			if (rrusse) {
				return N[0];
			}
		}
		return N[1];
	}
	
}
