package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240",  dimensions);

	    Monitor monitor = new Monitor("27 inch Beast" ,"Acer", 27, new Resolution(2540, 1440));

	    Motherboard motherboard = new Motherboard("Bj-200", "Asus",4, 6, "v2.44");

	    PC thePc = new PC(theCase, monitor, motherboard);
	    thePc.powerUp();

    }
}
