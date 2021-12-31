package com.company;

public class P {
    public static void p(){
        for(int i=0; i<4; i++){
            if(i==0 || i==3){
                for(int j=0; j<4; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            else{
                for(int j=0; j<5; j++){
                    if(j==0 || j==4){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        for (int j=0; j<3; j++){
            System.out.println("*");
        }
//        for(int i=0; i<5; i++){
//            if(i==0 || i==2){
//                for (int j=0; j<=5; j++){
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }
//            else if(i==1){
//                for (int j=0; j<=5;j++){
//                    if(j==0 || j==5){
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println("");
//            }
//            else {
//                System.out.println("*");
//            }
//        }
    }
}
