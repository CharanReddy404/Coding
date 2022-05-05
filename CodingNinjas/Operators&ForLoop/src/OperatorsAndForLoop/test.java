package OperatorsAndForLoop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=n; j>i+1; j--) {
				System.out.print(j);
			}
			System.out.print("*");
			for(int k=i; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

		}  
    }

