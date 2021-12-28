package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        for(int i=0; i<myIntArray.length; i++){
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);
        int[] myIntArray = getInt(10);
        for(int i=0; i<myIntArray.length; i++){
            System.out.println(i+" = "+myIntArray[i]);
        }

        System.out.println("The Average Of Array is: "+getAvg(myIntArray));

    }

    public static int[] getInt(int array){
        System.out.println("Enter "+array+" numbers:\r");
        int[] values = new int[array];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
//    public static void printArray(int[] array){
//        for(int i=0; i< array.length; i++){
//            System.out.println(i+" = "+ array[i]);
//        }
//    }
    public static double getAvg(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }
}
