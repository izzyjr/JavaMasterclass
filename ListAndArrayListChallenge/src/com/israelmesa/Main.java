package com.israelmesa;

public class Main {

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


    }
}
