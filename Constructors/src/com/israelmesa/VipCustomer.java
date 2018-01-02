package com.israelmesa;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email2;

    public VipCustomer(String name, int creditLimit, String email2) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email2 = email2;
    }

    public VipCustomer(String name, String email2) {
        this(name, 8000, email2);
    }

    public VipCustomer() {
        this("Default Name", 8000, "default@gmail.com" );
    }



    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail2() {
        return email2;
    }
}
