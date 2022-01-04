package fundamentals;
import java.util.Scanner;

public class CaseChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        char str = s.next().charAt(0);
        if(str>='A' && str<='Z'){
            System.out.println("1");
        }
        else if(str>='a' && str<='z'){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
	}

}
