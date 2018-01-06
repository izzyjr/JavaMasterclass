package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Sink theSink = new Sink(2, 1, 1, 1);
        Toilet theToilet = new Toilet(1);
        Shower theShower = new Shower(1, 1, 1, 1);

	    Bathroom theBathroom = new Bathroom(theSink, theToilet, theShower);

	    theBathroom.turnShowerOn("Hot");
	    theBathroom.turnSinkOn("Warm");

	    theBathroom.flush(3);
    }
}
