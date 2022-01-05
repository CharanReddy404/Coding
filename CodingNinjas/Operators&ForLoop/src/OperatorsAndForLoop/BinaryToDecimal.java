package OperatorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int decimal = 0, count = 0;
		while(n!=0) {
			int rem = n%10;
			if(rem ==1) {
				decimal+=Math.pow(2, count);
			}
			count++;
			n/=10;
		}
		System.out.println(decimal);
	}

}
