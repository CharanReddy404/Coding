package OperatorsAndForLoop;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =n, rem, count=0, equ=0, res=1, check=n;
		while (n != 0)
        {
            rem = n % 10;
            count++;
            n /= 10;
        }
		while (m != 0)
        {
			res =1;
            rem = m % 10;
            for(int i=0; i<count; i++) {
            	res=res*rem;
            }
            equ+=res;
            m /= 10;
        }
		if(check==equ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
