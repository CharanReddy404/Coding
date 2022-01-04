package OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i==2) {
					System.out.println(i);
				}
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(i);
			}
		}
	}

}
