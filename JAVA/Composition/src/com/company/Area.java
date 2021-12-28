package com.company;

public class Area {
    private double length;
    private double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void area(){
        getArea();
    }

    private double getArea(){
        System.out.println("area of the room is "+length*width);
        return length*width;
    }
}
