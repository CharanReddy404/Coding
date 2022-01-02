package com.company;

public class AdvancePattern {

    public static void advancePattern(){
//        butterflyPattern();
//        solidRhombus();
//        numberPyramid();
//        palindromicPattern();
        diamondPattern();
    }

    public static void diamondPattern(){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            int star = (i-1)*2;
            for(int k=0; k<=star; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1; i>=1; i--){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            int star = (i-1)*2;
            for(int k=0; k<=star; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void palindromicPattern(){
        int n=5;
        for(int i=1; i<=5; i++){
            for(int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k+" ");
            }
            for(int k=2; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }

    public static void numberPyramid(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(){
        int n =5;
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=5; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void butterflyPattern(){
        int n =4;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int m=2 *(n-i);
            for(int k=1; k<=m; k++){
                System.out.print(" ");
            }
//            for(int k=n; k>i; k--){
//                System.out.print(" ");
//            }
//            for(int k=n; k>i; k--){
//                System.out.print(" ");
//            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int m=2 *(n-i);
            for(int k=1; k<=m; k++){
                System.out.print(" ");
            }
//            for(int k=n; k>i; k--){
//                System.out.print(" ");
//            }
////            for(int k=n; k>i; k--){
////                System.out.print(" ");
////            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
