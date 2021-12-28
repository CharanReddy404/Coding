public class Main {
    public static void main(String[] args){
        isLeapYear(1600);
    }

    public static boolean isLeapYear(int year){
        if(year<0 || year>9999){
            System.out.println("Invalid Year");
            return false;
        }else if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println(year+" is a Leap Year");
                    return true;
                }else {
                    System.out.println(year+" is Not A Leap Year");
                    return false;
                }
            }else {
                return true;
            }
        }else {
            System.out.println(year+" is Not A Leap Year");
            return false;
        }
    }
}
