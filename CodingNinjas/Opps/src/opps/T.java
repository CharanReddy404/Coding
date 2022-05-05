package opps;

import java.util.Scanner;

//public class T {
//	public static void main(String[] args) 
//    { 
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int N = sc.nextInt();
//        int B = sc.nextInt();
//        int temp=0;
//        for(int i=1; i<B; i++) {
//        	temp +=N;
//        }
//        if(temp>A) {
//        	System.out.println(-1);
//        }else {
//        	System.out.println(N);
//        }
//    } 
//	
//}
interface A{
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements A{
    public void method(){
        System.out.println("Class Two method");
    }
}
public class T extends Two{
    public static void main(String[] args){
        A a = new Two();
        a.method();     
    }
}