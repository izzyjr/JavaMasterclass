package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int arraySize) {
        System.out.println("Enter " + arraySize + " Integer values");
        int[] values = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] values) {
        int max = 0;
        int[] sortedIntegers = new int[values.length];

        for (int i = 0; i < sortedIntegers.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[j] > max) {
                    max = values[j];
                }
            }
            values[i] = max;
            sortedIntegers[i] = values[i];
        }
        return sortedIntegers;
    }
    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
