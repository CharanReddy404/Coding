public class Main {
    public static void main(String[] args){
        hasEqualSum(1,1,0);
    }

    public static boolean hasEqualSum(int first, int second, int third){
        if((first+second)== third){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
}
