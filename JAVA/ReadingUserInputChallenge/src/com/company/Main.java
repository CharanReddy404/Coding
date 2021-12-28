package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 1;
        System.out.println("Enter the Sum of numbers:");

        while(count<=10){
            System.out.println("Enter The #"+count+" number:");
            boolean hasNestInt = scanner.hasNextInt();
            if(hasNestInt){
                number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                System.out.println("Invalid input");
            }
            scanner.nextLine();
        }
        System.out.println("the sum of all numbers is "+sum);
        scanner.close();
    }
}
