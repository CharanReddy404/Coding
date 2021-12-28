package com.company;

public class Main {

    public static void main(String[] args) {
	    sumFirstAndLastDigit(10);
    }

    public static int sumFirstAndLastDigit(int number){
        int first = 0;
        int last = 0;

        if(number<10){
            System.out.println("invalid value");
            return -1;
        }
        last = number%10;

        while (number!=0){
            first = number%10;
            number /= 10;
        }
        System.out.println("First Digit: "+first);
        System.out.println("Last Digit: "+last);
        int sum = first + last;
        System.out.println("the sum of first and last digit is "+sum);
        return sum;
    }
}
