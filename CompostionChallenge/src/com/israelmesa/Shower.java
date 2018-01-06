package com.israelmesa;

public class Shower {
    private int soapBars;
    private int shampoo;
    private int curtain;
    private int towel;

    public Shower(int soapBars, int shampoo, int curtain, int towel) {
        this.soapBars = soapBars;
        this.shampoo = shampoo;
        this.curtain = curtain;
        this.towel = towel;
    }

    public void turnWaterOn(String waterTemperature) {
        System.out.println("The water is: " + waterTemperature);
    }

    public int getSoapBars() {
        return soapBars;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getCurtain() {
        return curtain;
    }

    public int getTowel() {
        return towel;
    }
}
