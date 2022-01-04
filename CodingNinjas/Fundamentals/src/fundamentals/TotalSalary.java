package fundamentals;

import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		double hra = 0.2*basic;
		double da = 0.5*basic;
		int allow;
		double pf = 0.11*basic;
		char ch = s.next().charAt(0);
		if(ch == 'A') {
			allow = 1700;
		}
		else if(ch == 'B') {
			allow = 1500;
		}
		else {
			allow = 1300;
		}
		double sal = ((basic + hra + da + allow) - pf);
		double ts = Math.round(sal);
		int totalSalary = (int)(ts);
		System.out.println(totalSalary);
	}

}
