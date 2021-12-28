public class Main {
    public static void main(String[] args){
        double centimeters =calcFeetAndInchesToCentimeters(6,9 );
        if(centimeters<0.0){
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeters(420);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0) || ((inches<0) || (inches>12))){
            System.out.println("invalid value!");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet+" feet "+inches+" inches in centimeter is "+centimeters+"cm");
        return  centimeters;
    }

    public static  double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            System.out.println("invalid inches value");
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches =(int) inches % 12;
        System.out.println(inches+" inches is equal to "+feet+" feet and "+ remainingInches+" inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
