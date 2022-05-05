package OperatorsAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isFib = false;
		int n1=1, n2 = 1, n3=0;
		for(int i=2; i<n; i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			if(n==n2) {
				isFib = true;
				break;
			}
		}
		System.out.println(n2);
		System.out.print(isFib);
	}

}
