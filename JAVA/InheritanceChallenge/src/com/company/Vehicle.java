package com.company;

public class Vehicle {
    private String name;
    private String size;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public String getSize(){
        return this.size;
    }
}
