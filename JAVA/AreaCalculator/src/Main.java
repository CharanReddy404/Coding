public class Main {
    public static void main(String[] args){
        area(10.0);
        area(5.0, 4.0);
    }

    public static double area(double radius){
       // area of circle is A = pi*(r*r)

        if(radius<0){
            System.out.println("invalid value");
            return -1;
        }else {
            //double pi = 3.14159265359;
            double areaOfCircle = Math.PI*(radius * radius);
            System.out.println("Area of Circle is "+areaOfCircle);
            return areaOfCircle;
        }
    }

    public  static double area(double x, double y){
        //Area of Rectangle A = Length * width;
        if(x<0 || y<0){
            System.out.println("invalid value");
            return -1;
        }else {
            double areaOfRectangle = x * y;
            System.out.println("Area of Rectangle "+areaOfRectangle);
            return areaOfRectangle;
        }
    }
}
