package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 5.00, "Sesame Seed");

        hamburger.addHamburgerAddition1("Tomato", 1.00);
        hamburger.addHamburgerAddition2("Lettuce", .50);
        System.out.println("Total price is: " + hamburger.itemizedHamburger());
        System.out.println("...................................");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.00);

        healthyBurger.addHamburgerAddition1("Egg", 2.00);
        healthyBurger.addHealthAddition1("bacon", 3.50);
        System.out.println("Total: " + healthyBurger.itemizedHamburger());
        System.out.println("...................................");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addHamburgerAddition1("Guacamole", 4.00);
        System.out.println("Total: " + deluxeHamburger.itemizedHamburger());

    }
}
