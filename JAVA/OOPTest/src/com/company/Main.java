package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Q1",100,"white");
        hamburger.hamburgerAddition1("Tomato",30);
        hamburger.hamburgerAddition2("Lettuce",25);
        hamburger.hamburgerAddition3("Cheese",40);
        hamburger.hamburgerAddition4("Carrot",35);
        double price = hamburger.itemizeHamburger();
        System.out.println("Total Hamburger Price "+price+" RS");

        HealthyBurger healthyBurger = new HealthyBurger("HealtyBurger","chiken",300,"brown");
        healthyBurger.addHealthyAddition1("Egg",30);
        healthyBurger.addHealthyAddition2("lentils", 25);
        System.out.println("Healthy Burger Price "+hamburger.itemizeHamburger());
    }
}
