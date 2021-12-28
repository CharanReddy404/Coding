public class Main {
    public static void main(String[] args){
        shouldWakeUp(true, 2);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if((!barking) || ((hourOfDay<0) || (hourOfDay>23))){
            System.out.println("Invalid Values, parameter should be in the range 0-23");
            return false;
        }else if((hourOfDay<=8) || (hourOfDay>=22)){
            System.out.println("DOG Is Barking! Should WakeUp Now");
            return true;
        }else {
            System.out.println("since its not before 8, Don't WakeUp");
            return false;
        }

    }
}
