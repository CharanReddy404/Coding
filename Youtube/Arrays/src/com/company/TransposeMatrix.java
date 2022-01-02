package com.company;

import java.util.Scanner;

public class TransposeMatrix {
    public static void transpose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
