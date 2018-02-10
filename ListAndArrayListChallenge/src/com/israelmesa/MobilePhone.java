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
        System.out.println("You have " + mobilePhone.size() + " contacts! \n");
        for (int i = 0; i < mobilePhone.size(); i++) {
            System.out.println((i + 1)  + ". " + mobilePhone.get(i).getInfo());
        }
    }

    public void modifyContactInfo(int position, Contacts info) {
        mobilePhone.set(position - 1, info);
    }

    public Contacts chosen(int position) {
        Contacts chosen = mobilePhone.get(position - 1);
        return chosen;
    }

    public void contactSearch(String name) {
        boolean exists = false;
        for (int i = 0; i < mobilePhone.size(); i++) {
            if (mobilePhone.get(i).getName().equalsIgnoreCase(name)) {
                exists = true;
            }
        }
        if (exists) {
            System.out.println("Contact " + name + " exists!");
        } else {
            System.out.println("Contact " + name + " does not exist!");
        }
    }
}

