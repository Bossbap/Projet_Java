package representation;

import univers.*;

public abstract class Node implements Event{
	private String description;
	public static int nbnoeuds;
	public final int id;
	public Node[] N;
	public static Principal p;
	
	public Node(String description) {
		Node.nbnoeuds++;
		this.id = nbnoeuds;
		this.description = description;
	}
	
	public String getDesc() {
		return description;
	}
	
	public void setNodes(Node[] nlist) {
		this.N = nlist;
	}
	
	public void setDesc(String desc) {
		this.description = desc;
	}
	
	public void display() {
		System.out.println(this.description);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null || this.getClass() != other.getClass()) {
			return false;
		}
		
		Node ot = (Node) other;
		return this.id == ot.id;
	}
	
	public abstract Node choosenext();
		
}
