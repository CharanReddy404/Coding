package OperatorsAndForLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Integer.toBinaryString(n));  
//		int i=1; 
//		int binary=0;
//		while(n!=0) {
//			int rem = n%2;
//			binary+=rem*i;
//			i*=10;
//			n/=2;
//		}
//		System.out.print(binary);
	}

}
