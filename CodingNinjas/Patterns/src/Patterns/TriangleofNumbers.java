package Patterns;

import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(k+i);
			}
			for(int m=(2*i)-2; m>i-1; m--) {
				System.out.print(m);
			}
			
			System.out.println();
		}

	}

}
