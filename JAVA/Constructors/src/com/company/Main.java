package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount charanAcc = new BankAccount("tom","tom@gamil.com","9876543210"); //("01",1000.0,"Charan","charan@gmail.com", "25428819");
//        System.out.println("AccNumber: "+charanAcc.getAccNumber());
//        System.out.println("Balance: "+charanAcc.getBalance());
//        System.out.println("Name: "+charanAcc.getCustomerName());
//        System.out.println("Email: "+charanAcc.getEmail());
//        System.out.println("Phone: "+charanAcc.getPhone());

        VipCustomer charanVip = new VipCustomer("charan",100.0);//("Charan",1000.0,"charanVip@gmail.com");
        System.out.println("VIP Name: "+charanVip.getVipName());
        System.out.println("VIP CreditLimit: "+charanVip.getCreditLimit());
        System.out.println("VIP Email: "+charanVip.getEmail());

//
//        charanAcc.withdrawal(100.00);
//        charanAcc.deposit(1000.00);
//        charanAcc.withdrawal(100.00);
    }
}
