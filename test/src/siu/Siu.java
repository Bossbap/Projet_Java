package siu;

import java.util.Random;

public class Siu {
		
	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(0,2);
		for (int j = 0; j<10; j++) {
			System.out.println(i);
			i = r.nextInt(0,2);
		}
	}
}
