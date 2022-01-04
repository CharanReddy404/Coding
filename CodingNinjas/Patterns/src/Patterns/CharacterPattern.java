package Patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char alpha =(char)(64);
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(alpha+j));
			}
			alpha=(char)(alpha+1);
			System.out.println();
		}
	}

}
