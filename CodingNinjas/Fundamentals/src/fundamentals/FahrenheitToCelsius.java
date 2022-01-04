package fundamentals;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		if((S>=0 && S<=80) && (E>=S && E<=900) && (W>=0 && W<=40)) {
			for(int i=S; i<=E; i=i+W) {
				int celsius = (i-32)*5/9;
				System.out.println(i+" "+celsius);
			}
		}
	}

}
