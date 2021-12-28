package com.company;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int doors, int wheels, int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
