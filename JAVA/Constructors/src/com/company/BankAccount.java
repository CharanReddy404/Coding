package com.company;

public class BankAccount {
    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){
        this("0000", 0.0, "DefaultName", "Default@Email.com", "1234567890");
        System.out.println("Empty Constructor");
    }

    public BankAccount(String accNumber, double balance, String customerName, String email, String phone){
        System.out.println("Constructors with parameters");
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String customerName, String email, String phone){
        this("000", 0.00, customerName, email, phone);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposited amount "+depositAmount+" Successful. New balance "+this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<0){
            System.out.println("Available balance is "+this.balance+" withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount+" Successful. "+this.balance+" Remaining Balance");
        }
    }

    public void setAccNumber(String  accNumber){
        this.accNumber = accNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getAccNumber(){
        return this.accNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }


}
