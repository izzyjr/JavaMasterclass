package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        AddToppings addToppings = new AddToppings("Cheese", 2.00, "Bacon", 3.50,
                "Onions", 1.00, "Tomato", 1.25);
        Hamburger hamburger = new Hamburger("Basic", "Beef", "Sesame Seed", 5.00, addToppings);
        hamburger.burgerPricing();

        System.out.println("...............................................................................");

        AddToppings addToppings1 = new AddToppings("Cheese", 2.00, "Bacon", 3.50,
                "Onions", 1.00, "Tomato", 1.25);
        HealthyBurger healthyBurger = new HealthyBurger("Chicken Patty", 6.00, addToppings1);
        healthyBurger.burgerPricing("Guacamole", 2.50, "Beat Slices", 1.25);

        System.out.println("...............................................................................");

        AddToppings addToppings2 = new AddToppings("Cheddar", 2.00, "Bacon", 3.50,
                "Onion Rings", 2.50, "Egg", .50);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Turkey Burger", "Italian Roll", 7.00, addToppings2);
        deluxeBurger.burgerPricing();



    }
}
