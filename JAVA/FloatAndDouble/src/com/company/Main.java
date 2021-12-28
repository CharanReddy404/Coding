package com.company;

public class Main {

    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value: "+minFloatValue);
        System.out.println("Max Float Value: "+maxFloatValue);
        System.out.println();

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min double Value: "+minDoubleValue);
        System.out.println("Max double Value: "+maxDoubleValue);

        int intValue = 5/2;
        float floatValue = 5f/2f;
        double doubleValue = 5d/2d;

        System.out.println("intValue = "+intValue);
        System.out.println("floatValue = "+floatValue);
        System.out.println("doubleValue = "+doubleValue);
    }
}
