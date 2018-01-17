package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(2);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i +  " is: " + myIntegers[i]);
        }

        System.out.println("The average is: " + getAverage(myIntegers));








 int[] myIntArray = new int[10];
	    myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        System.out.println("..................................");

        double[] myDoubleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myDoubleArray[2]);
        System.out.println(myDoubleArray[3]);
        System.out.println(myDoubleArray[4]);
        System.out.println("..................................");

        int[] mySecondIntArray = new int[13];

        for (int i = 0; i < mySecondIntArray.length; i++) {
            mySecondIntArray[i] = i * 10;
        }

        printArray(myIntArray);
        System.out.println("..................................");

        printArray(mySecondIntArray);
        System.out.println("..................................");

        printArray(myDoubleArray);
        System.out.println("..................................");




    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double)sum / (double)array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println("Element " + i + " is: " + array[i]);
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println("Element " + i + " is: " + array[i]);
        }
    }
}
