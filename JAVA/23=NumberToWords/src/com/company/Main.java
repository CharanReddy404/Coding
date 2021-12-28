package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(456);
    }

    public static void numberToWords(int number){

        if(number>=0){
            while (number>0){
                int digit;
                digit =number%10;
                number/=10;
                System.out.print(digit);
            }
        }else {
            System.out.println("invalid Value");
        }
    }
}
