package com.israelmesa;

public class Vehicle {
    private String steering;
    private int gear;
    private int moving;

    public Vehicle(String steering, int gear, int moving) {
        this.steering = steering;
        this.gear = gear;
        this.moving = moving;
    }

    public Vehicle(String steering) {
        this(steering, 0, 0);
    }

    public int accelerate (int speed) {
        moving = moving + speed;
        System.out.println("Vehicle.accelerate() called. You are moving " + moving + " mph");
        return moving;
    }

    public int decelerate (int speed) {
        if (moving >= speed) {
            moving = moving - speed;
        }
        System.out.println("Vehicle.decelerate() called. You decelerated " + speed + " mph and currently moving " + moving + " mph");
        return moving;
    }

    public int gearChange(int change) {
        if (change < -1 || change > 1) {
            System.out.println("Error: you can only increase gears by 1 or decrease by -1");
        } else {
            gear = gear + change;
        }
        System.out.println("Vehicle.gearChange() called. You are on gear: " + gear);
        return gear;
    }

    public String getSteering() {
        return this.steering;
    }

    public int getGear() {
        return gear;
    }

    public int getMoving() {
        return moving;
    }
}
