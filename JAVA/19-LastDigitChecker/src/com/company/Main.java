package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){

        if((a>=10)&&(a<=1000) && (b>=10)&&(b<=1000) && (c>=10)&&(c<=1000)){
            System.out.println("does any give numbers "+a+", "+b+", "+c+" share the same last number ?");
            return ((a%10==b%10) || (a%10==c%10) || (b%10==c%10));
        }else {
            System.out.println("invalid value");
            return false;
        }
    }
    public static boolean isValid(int a){
        if((a>=10)&&(a<=1000)){
            System.out.println(a+" is in the range 10-1000");
            return true;
        }else {
            System.out.println("invalid value");
            return false;
        }
    }
}
