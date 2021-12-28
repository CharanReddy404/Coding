package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Indian Bank");

        bank.addBranch("Kolar");

        bank.addCustomer("Kolar","charan",1000.0);
        bank.addCustomer("Kolar","lucky",500.0);
        bank.addCustomer("Kolar","reddy",1500.0);

        bank.addBranch("Bangalore");

        bank.addCustomer("Bangalore", "ram", 200.0);
        bank.addCustomer("Bangalore", "sham", 300.0);
        bank.addCustomer("Bangalore", "kam", 600.0);

        bank.addCustomerTransaction("Kolar","charan", 5000.0);
        bank.addCustomerTransaction("Kolar","lucky", 600.0);
        bank.addCustomerTransaction("Kolar","charan", 1500.0);
        bank.addCustomerTransaction("Kolar","reddy", 500.0);

        bank.listCustomers("Kolar", true);
        bank.listCustomers("Bangalore",true);
    }
}
