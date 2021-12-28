package com.company;

public class Main {

    public static void main(String[] args) {
	    byte firstByte = 10;
        short firstShort = 20;
        int firstInt = 50;

        long firstLong = 50000L + (10L * (firstInt + firstByte + firstShort));
        System.out.println(firstLong);

        short totalShort = (short)(1000 + 10 * (firstShort + firstByte + firstInt));
        System.out.println(totalShort);
    }
}
