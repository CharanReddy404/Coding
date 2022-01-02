package com.company;

import java.util.Scanner;

public class StringArr {
    public static void arrLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        int totLen = 0;
        for(int i=0; i<names.length; i++){
            names[i] = sc.next();
            totLen += names[i].length();
        }

        System.out.println("the total length of array is "+totLen);
    }
}
