package ok;

import java.util.Random;

public class randomshi {
	public static void main(String[] Args) {
		int i = 0;
		Random r = new Random();
		boolean is = r.nextBoolean();
		int s0 = 0;
		int s1 = 0;
		while(i<1000) {
			if (is) {
				s0++;
			}
			else {
				s1++;
			}
			i++;
			is = r.nextBoolean();
		}
		System.out.println(s0);
		System.out.println(s1);
	}
}
