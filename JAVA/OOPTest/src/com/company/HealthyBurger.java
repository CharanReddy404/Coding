package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.healthyExtra1Name!=null){
            hamburgerPrice+=healthyExtra1Price;
            System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra1Price+" RS");
        }

        if(this.healthyExtra2Name!=null){
            hamburgerPrice+=healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra2Name+" for an extra "+this.healthyExtra2Price+" RS");
        }
        return hamburgerPrice;
    }
}
