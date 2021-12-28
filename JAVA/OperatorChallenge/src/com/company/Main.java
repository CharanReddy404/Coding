package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println("thirdDouble = "+thirdDouble);
        double fourthDouble = thirdDouble % 40.00d;
        System.out.println("fourthDouble or Remainder = "+fourthDouble);

        boolean isBoolean = (fourthDouble==0)? true : false;
        System.out.println("isBoolean is "+isBoolean);

        if(!isBoolean){
            System.out.println("Got Some Remainder. And The Remainder Is "+firstDouble);
        }
    }
}
