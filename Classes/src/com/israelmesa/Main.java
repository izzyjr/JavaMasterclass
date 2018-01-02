package com.israelmesa;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car subaru = new Car();

	    porsche.setModel("carrera");
	    subaru.setModel("outback");
        System.out.println("Model is: " + porsche.getModel());
        System.out.println("Model is: " + subaru.getModel());
        porsche.setModel("civic");
        System.out.println("Model is: " + porsche.getModel());




    }
}
