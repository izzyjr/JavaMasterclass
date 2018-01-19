package com.israelmesa;

public class AddToppings {
    private String toppingOne;
    private double topsPriceOne;

    private String toppingTwo;
    private double topsPriceTwo;

    private String toppingThree;
    private double topsPriceThree;

    private String toppingFour;
    private double topsPriceFour;

    public AddToppings(String toppingOne, double topsPriceOne, String toppingTwo, double topsPriceTwo, String toppingThree,
                       double topsPriceThree, String toppingFour, double topsPriceFour) {
        this.toppingOne = toppingOne;
        this.topsPriceOne = topsPriceOne;
        this.toppingTwo = toppingTwo;
        this.topsPriceTwo = topsPriceTwo;
        this.toppingThree = toppingThree;
        this.topsPriceThree = topsPriceThree;
        this.toppingFour = toppingFour;
        this.topsPriceFour = topsPriceFour;
    }

    public double toppingsTotal() {
        double total = 0;

        if (topsPriceOne != 0) {
            total += topsPriceOne;
            System.out.println("You added: " + toppingOne + ", Price: " + topsPriceOne);
        }
        if (topsPriceTwo != 0) {
            total += topsPriceTwo;
            System.out.println("You added: " + toppingTwo + ", Price: " + topsPriceTwo);
        }
        if (topsPriceThree != 0) {
            total += topsPriceThree;
            System.out.println("You added: " + toppingThree + ", Price: " + topsPriceThree);
        }
        if (topsPriceFour != 0) {
            total += topsPriceFour;
            System.out.println("You added: " + toppingFour + ", Price: " + topsPriceFour);
        }
        return total;
    }
}
