package com.israelmesa;

public class Hamburger {
   private String name;
   private String meat;
   private String bun;
   private double price;


    private boolean lettuce;
    private double lettucePrice = 0.50;

    private boolean tomato;
    private double tomatoPrice = 1.00;

    private boolean onions;
    private double onionsPrice = 0.50;

    private boolean cheese;
    private double cheesePrice = 2.00;

    public Hamburger(String name, String meat, String bun, double price) {
        this.name = name;
        this.meat = meat;
        this.bun = bun;
        this.price = price;
    }

    public double addToppingsAndTotal(boolean lettuce, boolean tomato, boolean onions, boolean cheese) {
        double toppingsPrice = 0;
        System.out.println("Burger: " + this.name + ", Meat: " + this.meat + ", Bun: " + this.bun);
        if (lettuce) {
            toppingsPrice += this.lettucePrice;
            System.out.println("Lettuce has been added for: " + this.lettucePrice);
        }
        if (tomato) {
            toppingsPrice += this.tomatoPrice;
            System.out.println("Tomato has been added for: " + this.tomatoPrice);
        }
        if (onions) {
            toppingsPrice += this.onionsPrice;
            System.out.println("Onions have been added for: " + this.onionsPrice);
        }
        if (cheese) {
            toppingsPrice += this.cheesePrice;
            System.out.println("Cheese has been added for: " + this.cheesePrice);
        }

        return price += toppingsPrice;

    }
}
