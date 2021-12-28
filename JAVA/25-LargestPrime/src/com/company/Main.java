package com.company;

public class Main {

    public static void main(String[] args) {
        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);
    }

    public static int getLargestPrime(int number){
        int largestPrime = 0;
        if(number>0){
            for (int i=1; i<=number; i++){
                if(number%i==0){
                    System.out.println(i);
                    if (isPrime(i)){
                        largestPrime = i;
                    }
                }
            }
            System.out.println("the largest prime factor number of "+number+" is "+largestPrime);
            return largestPrime;
        }else {
            System.out.println("invalid value");
            return -1;
        }
    }

    public static boolean isPrime(int n){

        for (int i=2; i>=2; i++){
            if(n==0 || n==1){
                return false;
            }
            if(n==i){
                return true;
            }
            if(n%i==0){
                return false;
            }
        }

        return isPrime(n);
    }
}
