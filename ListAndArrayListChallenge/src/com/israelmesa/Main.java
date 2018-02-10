package com.israelmesa;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        Contacts contact1 = new Contacts("John Green","(618) 264-6678");
        Contacts contact2 = new Contacts("Kerry Smith","(487) 553-2268");
        Contacts contact3 = new Contacts("Jose Church","(793) 425-7734");
        Contacts contact4 = new Contacts("Cristina Crow","(208) 336-8972");
        Contacts contact5 = new Contacts("Lisa Conte","(204) 785-2327");

        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        mobilePhone.addContact(contact3);
        mobilePhone.addContact(contact4);
        mobilePhone.addContact(contact5);

        mobilePhone.printContactList();
        mobilePhone.removeContact(contact5);
        mobilePhone.printContactList();

        editContact();
        mobilePhone.printContactList();
        mobilePhone.printContactList();
        searchByName();


    }

    public static void editContact() {
        System.out.println("Select Contact's list number: ");
        int listNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Edit name: ");
        String name = scanner.nextLine();
        System.out.println("Edit phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.chosen(listNumber).setName(name);
        mobilePhone.chosen(listNumber).setPhoneNumber(phoneNumber);
        mobilePhone.modifyContactInfo(listNumber, mobilePhone.chosen(listNumber));
    }

    public static void searchByName() {
        System.out.println("Search by contact's name: ");
        String contactName = scanner.nextLine();
        mobilePhone.contactSearch(contactName);
    }

//    public static void add() {
//
//    }


}
