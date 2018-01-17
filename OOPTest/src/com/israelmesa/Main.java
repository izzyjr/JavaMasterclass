package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Classic", "Beef", "Sesame Seed", 5.00);
        System.out.println("Total: " + hamburger.addToppingsAndTotal(false, true, true, true));
        System.out.println("..........................................");

        HealthyBurger healthyBurger = new HealthyBurger("Chicken Patty", 5.00, true, true);
        System.out.println("Total: " + healthyBurger.addToppingsAndTotal(true, true, true, true));
        System.out.println("..........................................");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Italian Roll", 5.00, true, true);
        System.out.println("Total: " + deluxeBurger.addToppingsAndTotal(true, true, true, true));

    }
}
