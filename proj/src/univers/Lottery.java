package univers;

import java.util.Random;
	
public class Lottery {
	public int result;
	
	public int draw(int startvalue) {
		Random random = new Random();
		result = random.nextInt(31)-20;
		return startvalue*result;
	}
}