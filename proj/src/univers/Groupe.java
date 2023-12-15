package univers;

public abstract class Groupe {
	protected String name;
	protected int cash;
	protected String intro;
	
	public Groupe(String n, int c, String in) {
		name = n;
		cash = c;
		intro = in;
	}
	
	public abstract void presentation();
	
}
