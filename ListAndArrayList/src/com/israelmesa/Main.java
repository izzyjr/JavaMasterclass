package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getInput(5);
        printArray(myIntegers);
        System.out.println("..................");

        myIntegers = resizeArray(myIntegers, 7);
        printArray(myIntegers);




    }

    private static int[] getInput(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " Integers: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0;  i < array.length; i++) {
            System.out.println("Element# " + i +  ": " + array[i]);
        }
    }

    private static int[] resizeArray(int[] array, int newSize) {
        int[] original = array;
        array = new int[newSize];

        for (int i = 0; i < original.length; i++) {
           array[i] = original[i];
        }
        for (int j = original.length; j < array.length; j++ ) {
            array[j] = s.nextInt();
        }
        return array;
    }


}
