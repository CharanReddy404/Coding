package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static int[] readInteger(int array){
        int[] values = new int[array];
        for(int i=0; i<values.length; i++){
            values[i] = scan.nextInt();
        }
    }
}
