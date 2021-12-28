package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println();
        getDaysInMonth(2,2000);
    }

    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }else {
            if(((year%4==0) &&(year%100!=0))||(year%400==0)){
                return true;
            }else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year){

        if((month<1) || (month>999)){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }
        boolean leap = isLeapYear(year);
        switch (month){
            case 1:
                System.out.println(month+" = January has 31 days");
                break;
            case 2:
                if(leap){
                    System.out.println(month+" = February has 29 days");
                }else {
                    System.out.println(month+" = February has 28 days");
                }
                break;
            case 3:
                System.out.println(month+" = March has 31 days");
                break;
            case 4:
                System.out.println(month+" = April has 30 days");
                break;
            case 5:
                System.out.println(month+" = May has 31 days");
                break;
            case 6:
                System.out.println(month+" = June has 30 days");
                break;
            case 7:
                System.out.println(month+" = July has 31 days");
                break;
            case 8:
                System.out.println(month+" = August has 31 days");
                break;
            case 9:
                System.out.println(month+" = September has 30 days");
                break;
            case 10:
                System.out.println(month+" = October has 31 days");
                break;
            case 11:
                System.out.println(month+" = November has 30 days");
                break;
            case 12:
                System.out.println(month+" = December has 31 days");
                break;
            default:
                break;
        }
        if(leap){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
        return 0;

    }
}
