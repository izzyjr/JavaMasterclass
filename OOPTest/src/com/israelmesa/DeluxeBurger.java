package com.israelmesa;

public class DeluxeBurger extends Hamburger{

    private boolean drink;
    private double drinkPrice = 3.50;

    private boolean chips;
    private double chipsPrice = 2.00;

    public DeluxeBurger(String bun, double price, boolean drink, boolean chips) {
        super("Deluxe Burger", "Turkey and Bacon", bun, price);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public double addToppingsAndTotal(boolean lettuce, boolean tomato, boolean onions, boolean cheese) {
        double deluxeItems = (drinkPrice + chipsPrice);
        System.out.println("Extra Deluxe Burger Items(Drink and Chips): " + deluxeItems);
        double base = super.addToppingsAndTotal(lettuce, tomato, onions, cheese);
        return base += deluxeItems;
    }
}
