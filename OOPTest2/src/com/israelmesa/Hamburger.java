package com.israelmesa;

public class Hamburger {
    private String name;
    private String meat;
    private String bun;
    private double price;
    private AddToppings addToppings;


    public Hamburger(String name, String meat, String bun, double price, AddToppings addToppings) {
        this.name = name;
        this.meat = meat;
        this.bun = bun;
        this.price = price;
        this.addToppings = addToppings;
    }

    public double burgerPricing() {
        double toppings = addToppings.toppingsTotal();
        double totalBurgerPrice = this.price + toppings;
        System.out.println("Burger: " + this.name + ", Meat: " + this.meat + ", Bun: " + this.bun +
        ", Total: " + totalBurgerPrice);
        return totalBurgerPrice;
    }
}
