package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The No Of Arrays:");
        int count = scanner.nextInt();
        int[] returnedArray = readInteger(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum number is "+returnedMin);
    }

    public static int[] readInteger(int count){
        int[] array = new int[count];
        System.out.println("Enter the values: ");
        for(int i=0; i<array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i]=number;

        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
