package com.company;

import java.util.Scanner;

public class MaxAndMin {
    public static void maxAndMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();
        int[] intArr = new int[size];
        for (int i=0; i<intArr.length; i++){
            intArr[i] = sc.nextInt();
        }
        for(int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]+" ");
        }
        min(intArr);
        max(intArr);
    }

    public static void min(int[] intArr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<intArr.length;i++){
            if(min>intArr[i]){
                min = intArr[i];
            }
        }
        System.out.println("Minimum Integer Value is "+min);
    }

    public static void max(int[] intArr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<intArr.length;i++){
            if(max<intArr[i]){
                max = intArr[i];
            }
        }
        System.out.println("Maximum Integer Value is "+max);
    }
}
