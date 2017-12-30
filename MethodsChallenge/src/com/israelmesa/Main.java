package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Juan",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Pedro",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Jose",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Pablo",position);

    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " Managed to get into position " + position + " on the high score table!!!");
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
