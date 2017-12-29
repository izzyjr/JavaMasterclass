package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //boolean
        //char

        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);
        myString = myString + " and some more...";
        System.out.println("My string is equal to: " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("My string is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "14.95";
        System.out.println("Result its: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

    }
}
