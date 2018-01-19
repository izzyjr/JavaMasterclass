package com.israelmesa;

public class DeluxeBurger extends Hamburger{
    private String deluxeOne = "drink";
    private double deluxeOnePrice = 2.00;

    private String deluxeTwo = "chips";
    private double deluxeTwoPrice = 1.50;

    public DeluxeBurger(String meat, String bun, double price, AddToppings addToppings) {
        super("Deluxe Burger", meat, bun, price, addToppings);
    }

    @Override
    public double burgerPricing() {
        double total = super.burgerPricing() + (this.deluxeOnePrice + this.deluxeOnePrice);
        System.out.println("You added Deluxe Item: " + this.deluxeOne + ", Price: " + this.deluxeOnePrice);
        System.out.println("You added Deluxe Item: " + this.deluxeTwo + ", Price: " + this.deluxeTwoPrice);
        System.out.println("Plus your Deluxe Items: " + total);
        return total;
    }
}




