package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        boolean gameOver = true;
        int score = 350;
        int bonus = 100;
        int levelCompleted = 100;

        calculateScore(gameOver, score, bonus, levelCompleted);

    }
    public static void calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver)
        {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("Final Score is: " +  finalScore);
        }
    }
}
