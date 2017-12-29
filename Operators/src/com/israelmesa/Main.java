package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " +  result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result =  result + 1;
        System.out.println("result is now: " + result);

        result++;
        System.out.println("result is now: " + result);

        result--;
        System.out.println("result is now: " + result);

        result += 2;
        System.out.println("result is now: " + result);

        result *= 10;
        System.out.println("result is now: " + result);

        result -= 10;
        System.out.println("result is now: " + result);

        result /= 10;
        System.out.println("result is now: " + result);

        boolean  isAlien = false;
        if (isAlien == false)
        {
            System.out.println("Not an Alien!");
        }
        int topScore = 100;
        if (topScore == 100)
        {
            System.out.println("You got the high score!");
        }
        int lowScore = 95;
        if (lowScore != 100)
        {
            System.out.println("You did not get the high score! " + lowScore);
        }
        topScore = topScore + 1;
        if (topScore > 100)
        {
            System.out.println("You got the highest score!");
        }

        if((topScore > 100) || (lowScore < 100))
        {
            System.out.println("Or works!");
        }

        int newValue = 50;

        if (newValue ==  50)
        {
            System.out.println("This is true!");
        }

        boolean isCar = false;

        if (isCar == true)
        {
            System.out.println("This is not supposed to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }

        double one = 20d;
        double two = 80d;
        double three = (one + two) * 25d;
        System.out.println("Three = " + three);
        double four  = three % 40;
        System.out.println("Four = " + four);
        if (four <= 20)
        {
            System.out.println("Total was over the limit");
        }
    }
}
