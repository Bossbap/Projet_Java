package representation;

import java.util.Scanner;

public abstract class Node {
	private String description;
	private static int nbnoeuds;		//A chaque introduction d'un nouveau noeud, nbnoeuds s'incremente et id prend la valeur nb noeuds.
	public final int id;
	public Node[] N;
	
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
	
	public abstract void setScan(Scanner s);
	
}
