package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int temp=0;
	    int[] myIntArray = new int[5];
        System.out.println("Enter The Numbers: ");
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = scanner.nextInt();
        }
        for (int i=0; i<myIntArray.length; i++){
            System.out.println("Element "+i+" typed value is "+myIntArray[i]);
        }

        for (int i =0; i<myIntArray.length; i++){
            for (int j=i+1; j<myIntArray.length; j++){
                if(myIntArray[i]<myIntArray[j]) {
                    temp = myIntArray[i];
                    myIntArray[i] = myIntArray[j];
                    myIntArray[j] = temp;
                }
            }
        }
        System.out.println("in descending order");
        for (int i=0; i<myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }
    }
}
