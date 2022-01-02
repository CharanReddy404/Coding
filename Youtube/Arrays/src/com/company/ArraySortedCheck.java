package com.company;

import java.util.Scanner;

public class ArraySortedCheck {
    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] intArr = new int[size];
        System.out.println("Enter the values:");
        for(int i=0; i<intArr.length; i++){
            intArr[i] = sc.nextInt();
        }
        for(int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
        int count = 0;
        for(int i=0; i<intArr.length-1; i++){
            if(intArr[i]<intArr[i+1]){
                count++;
            }
        }
        if(count!=0){
            System.out.println("The array is sorted in ascending order");
        }
        else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
