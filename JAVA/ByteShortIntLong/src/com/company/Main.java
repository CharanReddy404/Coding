package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        System.out.println("Max Value of int: "+intMaxValue);
        System.out.println("Mix Value of int: "+intMinValue);
        System.out.println("Busted Max Value: "+(intMaxValue +1));
        System.out.println("Busted Min Value: "+(intMinValue -1));
        System.out.println();

        Byte byteMaxValue = Byte.MAX_VALUE;
        Byte byteMinValue = Byte.MIN_VALUE;
        System.out.println("Max Value of byte: "+byteMaxValue);
        System.out.println("Mix Value of byte: "+byteMinValue);
        System.out.println();

        Short shortMaxValue = Short.MAX_VALUE;
        Short shortMinValue = Short.MIN_VALUE;
        System.out.println("Max Value of short: "+shortMaxValue);
        System.out.println("Mix Value of short: "+shortMinValue);
        System.out.println();

        Long longMaxValue = Long.MAX_VALUE;
        Long longMinValue = Long.MIN_VALUE;
        System.out.println("Max Value of long: "+longMaxValue);
        System.out.println("Mix Value of long: "+longMinValue);
        System.out.println();
    }
}
