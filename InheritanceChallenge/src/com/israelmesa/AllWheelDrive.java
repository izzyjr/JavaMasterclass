package com.israelmesa;

public class AllWheelDrive extends Car {
    public AllWheelDrive(String steering, int gear, int moving, int wheels) {
        super(steering, gear, moving, wheels);
    }

    public AllWheelDrive(String steering, int fourWheels) {
        super(steering, fourWheels);
    }

    public void awd(boolean functioning) {
        if (functioning) {
            System.out.println("AWD system is on");
        } else {
            System.out.println("AWD system is Off");
        }
    }
}
