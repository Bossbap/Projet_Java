package univers;

import java.io.Serializable; 
import java.util.Random;

@SuppressWarnings("serial")
public class Lottery implements Serializable{
	public int result;
	
	public int draw(int startvalue) {
		Random random = new Random();
		result = random.nextInt(31)-20;
		return startvalue*result;
	}
}