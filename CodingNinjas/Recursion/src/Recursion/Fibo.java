package Recursion;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int ans = fibo(4);
		System.out.print(ans);
	}
	
	public static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
		
	}

}
