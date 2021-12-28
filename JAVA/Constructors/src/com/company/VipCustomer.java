package com.company;

public class VipCustomer {
    private String vipName;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("VipDefaultName",100.0,"vip@gmail.com");
        System.out.println("Empty Constructor:");
    }

    public VipCustomer(String vipName, double creditLimit){
        this(vipName,creditLimit,"defaultVip@gammil.com");
        System.out.println("Constructor with 2 Parameters and default value:");
    }

    public VipCustomer(String vipName, double creditLimit, String email){
        System.out.println("Constructor with all 3 parameters:");
        this.vipName=vipName;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
