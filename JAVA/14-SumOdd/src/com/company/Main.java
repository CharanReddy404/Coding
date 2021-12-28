package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("is odd = "+isOdd(100));
        sumOdd(1,1999);
        //System.out.println("the sum of odd numbers is "+sumOdd(-1,100));
    }

    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2!=0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
//        boolean a = isOdd(start);
//        boolean b = isOdd(end);
        int sum = 0;
        if(start<=0 || end<=0){
            System.out.println("invalid value");
            return -1;
        }
        for( int i=start; i<=end; i++){
            boolean check = isOdd(i);
            if(check){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("the sum of odd numbers is "+sum);
        return sum;

    }
}
