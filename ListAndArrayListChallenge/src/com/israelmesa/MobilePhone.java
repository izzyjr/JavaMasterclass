package com.israelmesa;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> mobilePhone = new ArrayList<Contacts>();

    public void addContact(Contacts info) {
        mobilePhone.add(info);
    }

    public void removeContact(Contacts info) {
        mobilePhone.remove(info);
    }

    public void printContactList() {
        System.out.println("You have " + mobilePhone.size() + " contacts");
        for (int i = 0; i < mobilePhone.size(); i++) {
            System.out.println((i + 1)  + ". " + mobilePhone.get(i).getInfo());
        }
    }
}

