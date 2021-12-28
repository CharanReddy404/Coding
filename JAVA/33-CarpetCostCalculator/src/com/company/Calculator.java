package com.company;

public class Calculator {
    private Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (this.floor.getArea()*this.carpet.getCost());
    }
}
