package com.israelmesa;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName1;
    private double additionprice1;

    private String additionName2;
    private double additionprice2;

    private String additionName3;
    private double additionprice3;

    private String additionName4;
    private double additionprice4;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionName1 = name;
        this.additionprice1 = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionName2 = name;
        this.additionprice2 = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionName3 = name;
        this.additionprice3 = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionName4 = name;
        this.additionprice4 = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is: " + this.price);
        if (this.additionName1 != null) {
            hamburgerPrice += this.additionprice1;
            System.out.println("Added " + this.additionName1 + " for an extra " + this.additionprice1);
        }
        if (this.additionName2 != null) {
            hamburgerPrice += this.additionprice2;
            System.out.println("Added " + this.additionName2 + " for an extra " + this.additionprice2);
        }
        if (this.additionName3 != null) {
            hamburgerPrice += this.additionprice3;
            System.out.println("Added " + this.additionName3 + " for an extra " + this.additionprice3);
        }
        if (this.additionName4 != null) {
            hamburgerPrice += this.additionprice4;
            System.out.println("Added " + this.additionName4 + " for an extra " + this.additionprice4);
        }
        return hamburgerPrice;
    }
}
