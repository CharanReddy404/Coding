package fundamentals;

import java.util.Scanner;
public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int pow = 1;
		for(int i=1; i<=x; i++) {
			pow *=n;
		}
		System.out.println(pow);
	}

}
