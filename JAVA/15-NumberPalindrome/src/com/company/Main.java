package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(-212);
    }

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int remainder;
        int otherNumber= number;
        while (number!=0){
            remainder = number% 10;
            reverseNumber = reverseNumber * 10 +remainder;
            number /= 10;
        }
        if(reverseNumber == otherNumber){
            System.out.println(otherNumber+" is equal to "+reverseNumber+". So it is a palindrome");
            return true;
        }else {
            System.out.println(otherNumber+" is not equal to "+reverseNumber+". So its not a palindrome");
            return false;
        }

    }
}
