package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        int avg;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter the value:");
            boolean isNextInt = scanner.hasNextInt();
            if(isNextInt){
                int number = scanner.nextInt();
                sum+=number;
                count++;

            }else {
                break;
            }
            scanner.nextLine();
        }
        avg = (sum/count);
        System.out.println("Sum = "+sum);
        System.out.println("Avg = "+avg);
        scanner.close();
    }
}
