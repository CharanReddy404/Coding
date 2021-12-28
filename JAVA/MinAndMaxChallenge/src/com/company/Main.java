package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
//        other way
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;

        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter The Number:");
            boolean isNextInt = scanner.hasNextInt();
            if(isNextInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    max = number;
                    min = number;
                }
                if(number>max){
                    max = number;
                }
                if(number<min){
                    min = number;
                }
            }else {
                break;
            }
        }
        System.out.println("Min = "+min+" and Max = "+max);
        scanner.close();
    }
}
