package com.company;


class Car{
    private boolean engine;
    private boolean cylinder;
    private int wheels;

    public Car(boolean engine, boolean cylinder, int wheels, int noOfCylinder, String cylinderName) {
        this.engine = engine;
        this.cylinder = cylinder;
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public boolean getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public String  startEngine(){
        return "Base Class. Engine Started";
    }

    public String accelerate(){
        return "Base Class. Accelerate";
    }

    public String brake(){
        return "Base Class. Brake";
    }

}

class Audi extends Car{
    public Audi() {
        super(true, true, 4, 3, "cylinderAudi");
    }

    @Override
    public String startEngine(){
    return "Sub Class, Engine Started";
    }

    @Override
    public String accelerate(){
        return "Sub Class, Accelerate";
    }

//    @Override
//    public String brake(){
//        return "Sub Class, Brake";
//    }
}

public class Main {

    public static void main(String[] args) {
	    Audi audi = new Audi();
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }
}
