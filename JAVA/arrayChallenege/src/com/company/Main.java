package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myIntArray = getint(5);
        printArray(myIntArray);
        int[] sortedInt = sortArray(myIntArray);
        System.out.println(sortedInt);
//        for(int i=0; i<sortedInt.length; i++){
//            System.out.println(i+" = "+sortedInt[i]);
//        }
    }

    public static int[] getint(int array){
        System.out.println("Enter "+array+" numbers:\r");
        int[] values = new int[array];
        for(int i=0; i<values.length; i++){
            values[i] = scan.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(i+" = "+array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[1] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
