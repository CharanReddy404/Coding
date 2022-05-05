package arrays;

import java.util.Scanner;

public class testarray {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		char g = s.next().charAt(0);
		
		double hra = 0.2*b;
		double da = 0.5 * b;
		
		int allo;
		if(g=='A') {
			allo=1700;
		}else if(g=='B') {
			allo=1500;
		}
		else {
			allo=1300;
		}
		
		double pf = 0.11 * b;
		int total = (int) (b + hra + da + allo - pf);
		System.out.println(total);
	}
}
