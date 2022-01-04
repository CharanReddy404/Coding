package Patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=i-1; j<n; j++) {
				System.out.print((2*j+1));
			}
			for(int j=0; j<i-1; j++) {
				System.out.print((2*j+1));
			}
			System.out.println("");
		}

	}

}
