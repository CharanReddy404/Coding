package com.company;

public class BMW extends Car{
 private int roadServiceMonths;


    public BMW(int roadServiceMonths) {
        super("BMW01", "5Seats", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
