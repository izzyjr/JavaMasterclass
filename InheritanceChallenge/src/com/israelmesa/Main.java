package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Vehicle one = new Vehicle("Left");

        one.accelerate(60);
        one.gearChange(1);

        System.out.println(one.getSteering());
        System.out.println(one.getMoving());
        System.out.println(one.getGear());

        one.gearChange(1);
        System.out.println(one.getGear());

        one.accelerate(20);
        System.out.println(one.getMoving());
        one.decelerate(80);
        System.out.println(one.getMoving());

        System.out.println("****************************************************");

        Car two = new Car("right", 4);
        two.accelerate(60);
        two.gearChange(1);

        System.out.println("You are steering in this direction: " + two.getSteering());
        System.out.println("Your speed is: " + two.getMoving() + " mph");
        System.out.println("Your gear is: " + two.getGear());
        System.out.println("This vehicle has " + two.getFourWheels() + " wheels");

        two.gearChange(1);
        System.out.println(two.getGear());

        two.accelerate(20);
        System.out.println(two.getMoving());
        two.decelerate(80);
        System.out.println(two.getMoving());

        System.out.println("****************************************************");

        AllWheelDrive three = new AllWheelDrive("Straight", 4);


        three.accelerate(60);
        three.gearChange(1);

        System.out.println("You are steering in this direction: " + three.getSteering());
        System.out.println("Your speed is: " + three.getMoving() + " mph");
        System.out.println("Your gear is: " + three.getGear());
        System.out.println("This vehicle has " + three.getFourWheels() + " wheels");

        two.gearChange(1);
        System.out.println(three.getGear());

        three.accelerate(20);
        System.out.println(three.getMoving());
        three.decelerate(80);
        System.out.println(three.getMoving());
        three.awd(true);



    }
}
