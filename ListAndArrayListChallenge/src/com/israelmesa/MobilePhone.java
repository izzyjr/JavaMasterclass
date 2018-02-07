package com.israelmesa;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public void addContact(Contacts info) {
        contacts.add(info);
    }

    public void removeContact(Contacts info) {
        contacts.remove(info);
    }

    public void printContactList() {
        System.out.println("You have " + contacts.size() + " contacts");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1)  + ": " + contacts.get(i));
        }
    }
}
