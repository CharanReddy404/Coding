package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i=8; i>1; i--){
            System.out.println("10000 at "+i+"% Interest is "+String.format("%.2f",calculateInterest(10000.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
}
