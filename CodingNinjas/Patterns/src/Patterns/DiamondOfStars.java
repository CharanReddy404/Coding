package Patterns;
import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int n = sc.nextInt();
	      int num=(n/2)+1;
	    int count = num - 1;
	    for(int i = 1; i <= num; i++) {
	        for(int j = 1; j <= count; j++) {
	          System.out.print("*");
	        }

	        count--;

	        for(int k = 1; k <= (2 * i) - 1; k++) {
	          System.out.print(" ");
	        }

	        System.out.println("");
	    }
	    count = 1;

	    for(int i = 1; i <= (num - 1); i++) {
	      for(int j = 1; j <= count; j++) {
	        System.out.print("*");
	      }

	      count++;

	      for(int k = 1; k <= (2 * (num - i)) - 1; k++) {
	        System.out.print(" ");
	      }

	      System.out.println("");
	    }
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i,j;
//		for(i=0;i<=n/2;i++) {
//			for(j=-n/2;j<=n/2;j++) {
//				if(Math.abs(i)+Math.abs(j)<n/2) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
		}
//		for(int i=0; i<n;i++)
//			System.out.print("*");
//		
//		int n1=(n/2);
//		
//		for(int i=1; i<=n1;i++) {
//			for(int j=1;j<=n1-i;j++) {
//				System.out.print("*");
//			}
//			for(int l=1;l<=2*i-1;l++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=n1+i;k++) {
//				System.out.print("*");
//			}
//			cout
//		}
//		int n1, n2;
//		if(n%2==0) {
//			n1 = n/2;
//			n2 = n/2;
//		}
//		else {
//			n1 = (n+1)/2;
//			n2 = (n-1)/2;
//		}
//		for(int i=1; i<=n1; i++) {
//			for(int j=i; j<n1; j++) {
//				System.out.print(" ");
//			}
//			int a =(2*i)-1;
//			for(int j=0; j<a; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n2; i>=1; i--) {
//			for(int j=i; j<=n2; j++) {
//				System.out.print(" ");
//			}
//			int a =(2*i)-1;
//			for(int j=0; j<a; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
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

