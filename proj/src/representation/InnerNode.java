package representation;

public abstract class InnerNode extends Node{
	
	public InnerNode(String description) {
		super(description);
	}
	
	/*public InnerNode(String description,Node n1,Node n2,Node n3,Node n4) {
		super(description);
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}*/
	
	public abstract Node choosenext();
}
