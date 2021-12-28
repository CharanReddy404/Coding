package com.company;

public class Main {

    public static void main(String[] args) {
        int number;
        checkNumber(-1);
        checkNumber(0);
        checkNumber(1);
    }

    public static void checkNumber(int number){
        if(number>0){
            System.out.println(number+" is Positive");
        }else if(number<0){
            System.out.println(number+" is Negative");
        }else{
            System.out.println(number+" is Zero");
        }
    }
}
