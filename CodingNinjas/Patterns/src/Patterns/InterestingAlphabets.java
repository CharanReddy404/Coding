package Patterns;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char alpha =(char)(65+n);
		for(int i=1; i<=n; i++) {
			for(int j=i; j>0; j--) {
				System.out.print((char)(alpha-j));
			}
			System.out.println();
		}
	}

}
