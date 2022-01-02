package com.company;

import java.util.Scanner;

public class CircumferenceOfCircle {

    public static void circum() {
        Scanner sc = new Scanner(System.in);
        float pi = 22/7;
        System.out.println("Enter the radius of circle: ");
        float r = sc.nextInt();
        float cirOfCir = 2*(pi*r);
        System.out.println("the circumference of a circle is: "+cirOfCir);
    }
}
