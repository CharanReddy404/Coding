package Recursion;

import java.util.Scanner;

public class SubSequence {
	
	public static String[] subSeq(String s) {
		if(s.length()==0) {
			String[] output = new String[1];
			output[0]="";
			return output;
		}
		String[] smallOutput = subSeq(s.substring(1));
		String[] output = new String[2*smallOutput.length];
		for(int i=0; i<smallOutput.length;i++) {
			output[i] = smallOutput[i];
		}
		for(int i=0; i<smallOutput.length;i++) {
			output[i+smallOutput.length]=s.charAt(0)+ smallOutput[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		String[] seq = subSeq(s);
		for(String str:seq) {
			System.out.println(str);
		}
		sc.close();
	}
}
