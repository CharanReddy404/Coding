package com.company;

import java.util.Scanner;

public class GreaterIn2No {

    public static void grater(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2){
            System.out.println(n1+" is grater that "+n2);
        }
        else {
            System.out.println(n2+" is grater that "+n1);
        }
    }
}
