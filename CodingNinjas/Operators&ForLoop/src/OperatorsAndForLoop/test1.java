package OperatorsAndForLoop;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=i; j>0; j--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int k=n; k>i+1; k--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int k=n; k>i+1; k--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int j=i; j>0; j--) {
				System.out.print("0");
			}
			System.out.println();
		}

		}  
}
