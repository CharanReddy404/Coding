package OperatorsAndForLoop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
        for (int num = 2; num <= n; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
    }

}
