package com.company;

import java.util.Scanner;

public class Avg3Numbers {
    public static void avg(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = (n1 + n2 + n3);
        int avg = sum/3;
        System.out.println("the average of the sum :"+avg);
    }
}
