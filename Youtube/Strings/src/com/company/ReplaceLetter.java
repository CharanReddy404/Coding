package com.company;

import java.util.Scanner;

public class ReplaceLetter {
    public static void change(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the letter to be replaced: ");
        String r = sc.next();
        System.out.println("Enter the letter to replace With: ");
        String rw = sc.next();
        String result= "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==r.charAt(0)){
                result+= rw.charAt(0);
            }
            else {
                result+= str.charAt(i);
            }
        }
        System.out.println(str+" Changed to "+result);
    }
}
