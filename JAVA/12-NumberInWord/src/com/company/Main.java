package com.company;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println(number+" = Zero");
                break;
            case 1:
                System.out.println(number+" = One");
                break;
            case 2:
                System.out.println(number+" = Two");
                break;
            case 3:
                System.out.println(number+" = Three");
                break;
            case 4:
                System.out.println(number+" = Four");
                break;
            case 5:
                System.out.println(number+" = Five");
                break;
            case 6:
                System.out.println(number+" = Six");
                break;
            case 7:
                System.out.println(number+" = Seven");
                break;
            case 8:
                System.out.println(number+" = Eight");
                break;
            case 9:
                System.out.println(number+" = Nine");
                break;
            default:
                System.out.println(number+" is not in range of 0-9, it is Other");
        }
    }
}
