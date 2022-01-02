package com.company;

import java.util.Scanner;

public class CanVoteOrNot {

    public static void canVote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Your "+age+" years old\nYour Eligible To Vote");
        }
        else {
            System.out.println("Your "+age+" years old\nYour Not Eligible To Vote");
        }
    }
}
