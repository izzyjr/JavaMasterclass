package com.israelmesa;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe", "Sausage and Bacon", 8.00, "White Roll");
        super.addHamburgerAddition1("Chips", 3.00);
        super.addHamburgerAddition2("Drink", 2.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any more items");
    }
}
