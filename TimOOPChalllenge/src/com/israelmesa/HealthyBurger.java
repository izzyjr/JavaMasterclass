package com.israelmesa;

public class HealthyBurger extends Hamburger {

    private String healthExtra1Name;
    private double healthyExtra1Price;

    private String healthExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthExtra1Name + " for the price of: " + this.healthyExtra1Price);
        }
        if(this.healthExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthExtra2Name + " for the price of: " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
