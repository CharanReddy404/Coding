package com.company;

import java.util.Scanner;

public class NoOfPNZ {
    public static void noOfPNZ(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of values: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int PCount = 0;
        int NCount = 0;
        int ZCount = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>0){
                PCount++;
            }
            else if(arr[i]<0){
                NCount++;
            }
            else {
                ZCount++;
            }
        }

        System.out.println("No of zero's are: "+ZCount);
        System.out.println("No of Positive numbers are: "+PCount);
        System.out.println("No of Negative numbers are: "+NCount);
    }
}
