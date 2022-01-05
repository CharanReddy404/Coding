package OperatorsAndForLoop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0, prd = 1; 
		if(c==1) {
			for(int i=1; i<=n; i++) {
				sum +=i;
			}
			System.out.println(sum);
		}
		else if(c==2) {
			for(int i=1; i<=n; i++) {
				prd *=i;
			}
			System.out.println(prd);
		}
		else {
			System.out.println("-1");
		}
	}

}
