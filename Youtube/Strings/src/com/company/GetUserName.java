package com.company;

import java.util.Scanner;

public class GetUserName {
    public static void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email: ");
        String email = sc.nextLine();
        String userName="";
        for (int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else {
                userName+= email.charAt(i);
            }
        }
        System.out.println("Email: "+email);
        System.out.println("UserName: "+userName);
    }
}