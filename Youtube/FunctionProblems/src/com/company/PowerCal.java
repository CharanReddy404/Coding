package com.company;

import java.util.Scanner;

public class PowerCal {
    public static void powCal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and power: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = 1;
        for(int i=0; i<n; i++){
            result*=x;
        }
        System.out.println("the "+x+" power of "+n+" is "+result);
    }
}
