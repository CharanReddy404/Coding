package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9876543210");
    public static void main(String[] args) {

        boolean quit = false;
        smartPhone();
        printActions();

        while (!quit){
            System.out.println("\n enter action(6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting down.....");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact(){
        System.out.println("enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("enter new contact phone number:");
        String phone =  scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)){
            System.out.println("Contact name = "+name+" phone = "+phone+" added Successfully");
        }else {
            System.out.println("Can't add contact, "+name+" Already Exist");
        }
    }

    private static void removeContact(){
        System.out.println("enter the existing contact:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("contact does not exist");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("contact deleted Successfully");
        }else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact(){
        System.out.println("enter the existing contact:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("contact does not exist");
            return;
        }
        System.out.println("name = "+existingContactRecord.getName()+" and phone number is "+existingContactRecord.getPhoneNumber());
    }

    private static void updateContact(){
        System.out.println("enter the existing contact:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("contact does not exist");
            return;
        }
        System.out.println("enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("enter new contact phone number:");
        String newPhone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newPhone);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully Updated contact");
        }else {
            System.out.println("error updating contact");
        }
    }

    private static void smartPhone(){
        System.out.println("Starting Phone....");
    }

    private static void printActions(){
        System.out.println("0 - to Shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add new contact");
        System.out.println("3 - to update an existing contact");
        System.out.println("4 - to remove an existing contact ");
        System.out.println("5 - query if any contact exist");
        System.out.println("6 - to print a list of available action");
        System.out.println("\n Enter your choice: ");
    }
}
