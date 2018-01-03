package com.israelmesa;

public class Car extends Vehicle {
    private int fourWheels;

    public Car(String steering, int gear, int moving, int wheels) {
        super(steering, gear, moving);
        this.fourWheels = wheels;
    }

    public Car(String steering, int fourWheels) {
        super(steering);
        if (fourWheels == 4) {
            this.fourWheels = fourWheels;
        }
    }

    public int getFourWheels() {
        return fourWheels;
    }
}
