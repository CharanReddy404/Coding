package com.company;

import java.util.Scanner;

public class TwoDArray {
    public static void array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Enter the number to search: ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(x== numbers[i][j]){
                    System.out.println(x+" is found in ["+i+","+j+"] position");
                    break;
                }
            }
        }
    }
}
