package com.israelmesa;

import java.util.Arrays;
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
//        int[] sortedIntegers = new int[values.length];
//
//        for (int i = 0; i < sortedIntegers.length; i++) {
//            sortedIntegers[i] = values[i];
//        }
        int[] sortedIntegers = Arrays.copyOf(values, values.length); //Replaces code right above ^
        int temp;
        boolean flag = true;

        while (flag)
        {
            flag = false;
            for (int j = 0; j < sortedIntegers.length - 1; j++) {
                if (sortedIntegers[j] < sortedIntegers[j + 1]) {
                    temp = sortedIntegers[j];
                    sortedIntegers[j] = sortedIntegers[j + 1];
                    sortedIntegers[j + 1] = temp;
                    flag = true;
                    System.out.println("number of tries " + j);
                }
            }
            System.out.println("...........................");
        }
        return sortedIntegers;
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
