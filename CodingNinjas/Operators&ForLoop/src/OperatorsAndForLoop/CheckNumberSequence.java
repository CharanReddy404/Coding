package OperatorsAndForLoop;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean test = true, check = false;
		int first = sc.nextInt();
		int count = 0,n1=0;
		for(int i=1; i<n; i++) {
			int second = sc.nextInt();
			if(first == second) {
				count++;
			}
			if(check==true) {
				if(second<n1) {
					count++;
				}
			}
			if(first>=second) {
				first=second;
				n1 = first;
			}
			else if(n1<second) {
				n1=second;
				check = true;
			}
		}
		if(count>0) {
			test = false;
		}
		System.out.println(test);
	}

}
