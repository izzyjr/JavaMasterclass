package com.israelmesa;

public class HealthyBurger extends Hamburger{

    private boolean guacamole;
    private double guacamolePrice = 3.00;

    private boolean spinach;
    private double spinachPrice = 2.00;

    public HealthyBurger(String meat,double price, boolean guacamole, boolean spinach) {
        super("Healthy Burger", meat, "Rye Brown", price);
        this.guacamole = guacamole;
        this.spinach = spinach;
    }

    @Override
    public double addToppingsAndTotal(boolean lettuce, boolean tomato, boolean onions, boolean cheese) {
        double healthyItems = (guacamolePrice + spinachPrice);
        System.out.println("Extra Healthy Burger toppings(Guacamole and Spinach): " + healthyItems);
        double base = super.addToppingsAndTotal(lettuce, tomato, onions, cheese);
        return base += healthyItems;
    }
}
