package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        int a=0;
        if(number>1){
            for (int i=1; i<number; i++){
                if(number%i==0){
                    //System.out.println(i);
                    a +=i;
                }
                if(number==a){
                    return true;
                }
            }
        }
        return false;
    }
}
