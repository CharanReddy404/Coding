package com.company;

import java.util.Scanner;

public class Names {
    public static void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
        System.out.println("Enter Names: ");
        for(int i=0; i<names.length;i++){
            names[i] = sc.nextLine();
        }
        for(int i=0; i<names.length; i++){
            System.out.println((i+1)+" "+names[i]);
        }
    }
}
