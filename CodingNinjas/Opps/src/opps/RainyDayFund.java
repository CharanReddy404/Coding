package opps;

import java.util.Scanner;

public class RainyDayFund {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rdf = RDF(n);
		System.out.println(rdf);
		sc.close();
	}
	
	public static int RDF(int n) {
		int rdf = 0;
		int temp =n;
		int i=1, j=0;
		int t=1;
		while(temp!=0) {
			rdf+=i;
			i++;
			j++;
			if(j==7) {
				i=t+1;
				j=0;
				t++;
			}
			temp--;
		}
		return rdf;
	}

}
