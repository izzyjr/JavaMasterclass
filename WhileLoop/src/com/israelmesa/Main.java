package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is equal to: " + count);
            count++;
        }
        System.out.println("..........................");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is equal to: " + count);
            count++;
        }
        System.out.println("..........................");

        count = 1;
        do {
            System.out.println("Count value is equal to: " + count);
            count++;
        } while (count < 6);

        int n = 5;
        int finish = 20;
        int countEven = 0;
        System.out.println("Is " + n + " an even number? " + isEvenNumber(n));

        while (n <= finish) {
            if (!isEvenNumber(n)) {
                n++;
            } else {
                System.out.println(n + " is even!");
                n++;
                countEven++;
            }
            if (countEven == 5) {
                System.out.println("Even count is: " + countEven);
                break;
            }
        }


    }
    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
