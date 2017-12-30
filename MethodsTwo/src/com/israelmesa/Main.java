package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final Score is: " +  highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final Score is: " +  highScore);

        boolean gameOver = true;
        int score = 350;
        int bonus = 100;
        int levelCompleted = 100;

        highScore = calculateScore(gameOver, score, bonus, levelCompleted);
        System.out.println("Final Score is: " +  highScore);

    }
    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver)
        {
            int finalScore = score + (bonus * levelCompleted);
            return finalScore;
        } else {
            return -1;
        }
    }
}
