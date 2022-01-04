package Patterns;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			int star = (i-1)*2;
			for(int k=0; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
