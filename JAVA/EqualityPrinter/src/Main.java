public class Main {
    public static void main(String[] args){
        printEqual(1,-3,2);
    }

    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("invalid Parameters");
        }else {
            if(a==b && b==c){
                System.out.println("All Are Equal");
            }else if(a!=b && b!=c && a!=c){
                System.out.println("All Are Different");
            }else {
                System.out.println("Neither All Are Equal Or Different");
            }
        }
    }
}
