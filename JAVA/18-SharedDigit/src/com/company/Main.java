package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25,55));
    }

    public static boolean hasSharedDigit(int first, int last){
        if(((first>=10)&&(first<=99)) && ((last>=10)&&(last<=99)) ){
            int firstNumberLastDigit = first % 10;
            int secondNumberLastDigit = last % 10;

            first/=10;
            last/=10;

            int firstNumberFirstDigit = first;
            int secondNumberFirstDigit = last;
            System.out.println("Shared Digit in the given number");
            return ((firstNumberFirstDigit==secondNumberFirstDigit)||(firstNumberFirstDigit==secondNumberLastDigit)
                    ||(secondNumberFirstDigit==firstNumberFirstDigit)||(secondNumberLastDigit==firstNumberLastDigit));
        }
        System.out.println("invalid value");
        return false;

    }
}
