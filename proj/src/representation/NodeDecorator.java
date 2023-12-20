package representation;

public abstract class NodeDecorator implements Event{
	
	public abstract void display();
	
	public abstract Node choosenext();
}
