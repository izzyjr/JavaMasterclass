package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        // int has a width of 32
        //Will get error if int is larger or smaller
        int myMinValue = -2147483648; //Underscore can be added for readability
        int myMaxValue = 2147483647;
        int total = (myMinValue/ 2);
        System.out.println("total: " + total);

        // byte has a width of 8
        byte myByteMax = 127;
        byte myByteMin = -128;
        byte myNewByteValue = (byte) (myByteMax / 2); // casting
        System.out.println("myNewByteVAlue: " + myNewByteValue);


        // short has a width of 16
        short myShortMax = 32767;
        short myShortMin = -32768;

        // long has a width of 64
        long myLongMax = 100L;

        byte one = 10;
        short two = 1000;
        int three = 2000;
        long four = (50000L + ((one + two + three) * 10L)); // no need to cast with long variables
        short five = (short) (50000L + ((one + two + three) * 10L)); //casting required
        System.out.println("four: " + four);
        System.out.println("five: " + five);
    }
}
