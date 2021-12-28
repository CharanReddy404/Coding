package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of Arrays: ");
        int number = scan.nextInt();
        int[] myIntArray = readIntegers(number);
        reverse(myIntArray);
//        System.out.println(Arrays.toString(myIntArray));
//        System.out.println("The min value of array is "+findMin(myIntArray));
    }

    public static int[] readIntegers(int count){
        System.out.println("enter values: ");
        int[] values = new int[count];
        for(int i=0; i<values.length; i++){
//            System.out.println("enter array of "+i+" value ");
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int[] minArray = array;
        int min = Integer.MAX_VALUE; //minArray[0];
        for(int i=0; i<minArray.length; i++){
            if(min>minArray[i]){
                min = minArray[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array){
        System.out.println(Arrays.toString(array));
        int[] revArray = new int[array.length];
        int j = array.length;
        for(int i=0; i<revArray.length; i++){
            revArray[j-1] = array[i];
            j-=1;
        }
        System.out.println(Arrays.toString((revArray)));
    }
}
