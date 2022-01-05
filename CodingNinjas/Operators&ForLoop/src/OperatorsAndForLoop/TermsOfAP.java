package OperatorsAndForLoop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int AP, count=0;
		for(int i=1; i<=n;) {
			++count;
			AP = (3*count + 2);
			if(AP%4!=0) {
				System.out.print(AP+" ");
				i++;
			}
			
		}

	}

}
