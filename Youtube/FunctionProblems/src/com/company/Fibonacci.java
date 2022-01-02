package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void fibo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int fibo = 0;
        System.out.println("Fibonacci numbers still "+n+" is ");
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            fibo = a+b;
            a = b;
            b = fibo;
        }
    }
}
