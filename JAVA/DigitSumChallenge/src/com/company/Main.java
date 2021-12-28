package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(143);
        sumDigits(420);
        sumDigits(8143);
        sumDigits(-143);
    }

    public static int sumDigits(int number){
        if(number<10){
            System.out.println("Invalid Value!!, Because digit is lesser that 10");
            return -1;
        }
        int sum=0;
        while (number>0){
            int digit;
            digit = number%10;
            sum +=digit;
            number /=10;
        }
        System.out.println("the sum of digits is "+sum);
        return sum;
    }
}
