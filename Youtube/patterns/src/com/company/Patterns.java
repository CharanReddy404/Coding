package com.company;

import java.util.Scanner;

public class Patterns {

    public static void patterns(){
        print();
        Scanner input = new Scanner(System.in);
        boolean state = true;
        while (state){
            System.out.println("Enter Your Choice: ");
            int Choice = input.nextInt();
            switch (Choice){
                case 0:
                    System.out.println("Exit");
                    state = false;
                    break;
                case 1:
                    solidRectangle();
                    continue;
                case 2:
                    hollowRectangle();
                    continue;
                case 3:
                    halfPyramid();
                    continue;
                case 4:
                    invertedHalfPyramid();
                    continue;
                case 5:
                    invertedHalfPyramid180();
                    continue;
                case 6:
                    halfPyramidWithNumbers();
                    continue;
                case 7:
                    invertedHalfPyramidWithNumbers();
                    continue;
                case 8:
                    floydTriangle();
                    continue;
                case 9:
                    triangleWith0_1();
                    continue;
                case 10:
                    print();
                    continue;
                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }
        }
    }
    public static void print(){
        System.out.println("9 Best Pattern Menu:");
        System.out.println("======================");
        System.out.println("1. Solid Rectangle");
        System.out.println("2. Hollow Rectangle");
        System.out.println("3. Half Pyramid");
        System.out.println("4. Inverted HalfPyramid");
        System.out.println("5. 180 Inverted HalfPyramid");
        System.out.println("6. HalfPyramid With Numbers");
        System.out.println("7. Inverted HalfPyramid With Numbers");
        System.out.println("8. Floyd Triangle");
        System.out.println("9. Triangle With 0's 1's");
        System.out.println("10. Menu");
        System.out.println("0. Exit");
    }

    public static void triangleWith0_1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }
    }


    public static void floydTriangle(){
        int a=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+"  ");
                a++;
            }
            System.out.println("");
        }
    }

    public static void invertedHalfPyramidWithNumbers(){
//        for(int i=1; i<=5; i++){
//            for(int j=5; j>=i; j--){
//                System.out.print(j+"");
//            }
//            System.out.println("");
//        }
//  or
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void halfPyramidWithNumbers(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void invertedHalfPyramid180(){
        int n=4;
        for (int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=i; k>=1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void invertedHalfPyramid(){
//        for(int i=1; i<=4; i++){
//            for(int j=4; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//  or
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void halfPyramid(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void solidRectangle(){
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(){
//        for(int i=0; i<4; i++){
//            if(i==0 || i==3){
//                for(int j=0; j<5; j++){
//                    System.out.print("*");
//                }
//            }
//            else {
//                for(int k=0; k<5; k++){
//                    if(k==0 || k==4){
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//        or
        for(int i=1; i<=4; i++){
            for (int j=1; j<=5; j++){
                if(j==1 || j==5 || i==1 || i==4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
