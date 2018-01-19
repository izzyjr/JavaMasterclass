package com.israelmesa;

public class HealthyBurger extends Hamburger {
    private String healthyOne;
    private double healthyPriceOne;

    private String healthyTwo;
    private double healthyPriceTwo;

    public HealthyBurger(String meat, double price, AddToppings addToppings) {
        super("Healthy Burger", meat, "Rye Brown", price, addToppings);
    }


    public void burgerPricing(String topping, double price, String topping2, double price2) {
        if (price != 0) {
            this.healthyOne = topping;
            this.healthyPriceOne = price;
            System.out.println("You added Healthy Item: " + this.healthyOne + ", Price: " + this.healthyPriceOne);
        }
        if (price2 != 0) {
            this.healthyTwo = topping2;
            this.healthyPriceTwo = price2;
            System.out.println("You added Healthy Item: " + this.healthyTwo + ", Price: " + this.healthyPriceTwo);
        }

        double total = super.burgerPricing() + (this.healthyPriceOne + this.healthyPriceTwo);
        System.out.println("Plus your Healthy Items: " + total);

    }
}
