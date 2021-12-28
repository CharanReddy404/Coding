package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,50));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd = 1;
        if((first>=10)&&(second>=10)){
            for(int i=1; (i<=first) && (i<=second); i++){

                if(first%i==0 && second%i==0){
                    gcd = i;
                }
            }
            System.out.println("GCD of "+first+" and "+second+" is");
            return gcd;
        }else {
            System.out.println("invalid value");
            return -1;
        }
    }
}
