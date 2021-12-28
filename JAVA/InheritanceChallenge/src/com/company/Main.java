package com.company;

public class Main {

    public static void main(String[] args) {
	 Vehicle car1 = new Vehicle("bmw1", "6S");
     BMW bmw1 = new BMW(5);

     System.out.println(bmw1.getName());
     System.out.println(bmw1.getSize());

     Car car2 = new Car("audi", "2Sets",3,5,6,false);
        System.out.println("Name: "+car2.getName());
        System.out.println("Sets: "+car2.getSize());
        System.out.println("Doors: "+car2.getDoors());
        System.out.println("Wheels: "+car2.getWheels());
        System.out.println("Gears: "+car2.getGears());
        System.out.println("IsManual: "+car2.getIsManual());
        System.out.println("CurrentGear: "+car2.getCurrentGear());


    }
}
