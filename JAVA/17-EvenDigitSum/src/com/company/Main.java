package com.company;

public class Main {

    public static void main(String[] args) {
	    getEvenDigitSum(1426784543);
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number<0){
            System.out.println("Invalid Value");
            return -1;
        }
        while (number!=0){
            int digit = number%10;
            if(digit%2==0){
                System.out.println(digit);
                sum +=digit;
            }
            number/=10;
        }
        System.out.println("sum of even digits "+sum);
        return sum;
    }
}
