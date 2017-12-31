package com.israelmesa;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value equals neither");
//        }

        //A switch works with the byte , short , char , and int primitive data types. Strings too

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Equals 1");
                break;

            case 2:
                System.out.println("Equals 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Equals: 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Value equals neither");
                break;
        }
        char key = 'E';

        switch (key) {
            case 'A':
                System.out.println("You are playing in the key of A");
                break;

            case 'B':
                System.out.println("You are playing in the key of B");
                break;

            case 'C':
                System.out.println("You are playing in the key of C");
                break;

            case 'D':
                System.out.println("You are playing in the key of D");
                break;

            case 'E': case 'F': case 'G':
                System.out.println("You could be playing in E, F, or G");
                System.out.println("It is actually E!");
                break;

            default:
                System.out.println("Radical, that's a strange key!");
                break;
        }

        String birthMonth = "JUNE";

        switch (birthMonth.toLowerCase()) {
            case "june":
                System.out.println("Party Time!");
                break;

            case "july":
                System.out.println("No party time!");
                break;

            default:
                System.out.println("Who knows?!");
                break;
        }

    }
}
