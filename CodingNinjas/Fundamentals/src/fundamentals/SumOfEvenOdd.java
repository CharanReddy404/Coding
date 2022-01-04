package fundamentals;

import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean test = true;
		int odd = 0;
		int even = 0;
		while(test) {
			int rem = n%10;
			if(rem%2 == 0) {
				even += rem; 
			}
			else {
				odd += rem;
			}
			n = n/10;
			if(n==0) {
				test = false;
			}
		}
		System.out.print(even+" "+odd);
	}

}
