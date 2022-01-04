package Patterns;
import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1, n2;
		if(n%2==0) {
			n1 = n/2;
			n2 = n/2;
		}
		else {
			n1 = (n+1)/2;
			n2 = (n-1)/2;
		}
		for(int i=1; i<=n1; i++) {
			for(int j=i; j<n1; j++) {
				System.out.print(" ");
			}
			int a =(2*i)-1;
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n2; i>=1; i--) {
			for(int j=i; j<=n2; j++) {
				System.out.print(" ");
			}
			int a =(2*i)-1;
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i=0; i<n; i++) {
//			for(int j=i; j<n; j++) {
//				System.out.print(" ");
//			}
//			int a=(i+2);
//			for(int k=1; k<a; k++) {
//				System.out.print("*");
//			}
//			for(int m=a-1; m>1; m--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=n; i>=0; i--) {
//			for(int j=i; j<n; j++) {
//				System.out.print(" ");
//			}
//			int a=(i+2);
//			for(int k=1; k<a; k++) {
//				System.out.print("*");
//			}
//			for(int m=a-1; m>1; m--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	}

}
