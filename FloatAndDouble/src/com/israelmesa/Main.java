package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        // int width 32 (4 bytes)
        int myIntValue = 5 / 2;

        // float width 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // double width 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        double myWeightPounds = 178d;
        double poundsToKilos  = 0.45359237d;
        double myWeightInKilos = myWeightPounds * poundsToKilos;

        System.out.println("myWeightInKilos: " + myWeightInKilos);
    }
}
