package com.company;

public class Main {

    public static void main(String[] args) {
	    printSquareStar(10);
    }

    public static void printSquareStar(int number){
        if(number>=5){
            for (int i=1; i<=number; i++){
                for(int j=1; j<=number; j++){
                    if(i==1 || i==number || j==1 || j==number || j==number-i+1 || i==j){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }
        }else {
            System.out.println("the value is less that 5");
        }
    }
}
