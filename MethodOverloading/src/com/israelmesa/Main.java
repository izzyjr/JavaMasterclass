package com.israelmesa;

public class Main {

    public static void main(String[] args) {
//	int newScore = calculateScore("Israel", 500);
//        System.out.println("New score is: " + newScore);
//
//        calculateScore(75);
//        calculateScore();
            calcFeetAndInchesToCentimeters(6, 0);
            calcFeetAndInchesToCentimeters(100);

    }
//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored: " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore(int score){
//        System.out.println("Player unnamed scored: " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return 0;
//    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid feet or inches");
            return -1;
        } else {
            double calculated = ((feet * 12) + inches) * 2.54d;
            System.out.println("Conversion to Centimeters: " + calculated + "cm");
            return calculated;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            System.out.println("Error");
            return -1;
        } else {
            double feetToInches = (int) inches / 12;
            double remainderInches = (int) inches % 12;
            System.out.println(feetToInches + " feet and " + remainderInches + " inches");
            return calcFeetAndInchesToCentimeters(feetToInches, remainderInches);
        }
    }
}
