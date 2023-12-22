package ok;

import java.io.File;
import java.util.Scanner;

public class hmmm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			System.out.println("oui");
		}
		else {
			System.out.println("non");
		}
		s.next();
		System.out.println(s.nextInt());
	}
}
