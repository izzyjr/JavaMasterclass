package com.israelmesa;

 class Car {
    private int cylinders;
    private String name;
    private int wheels = 4;
    private boolean hasEngine = true;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
        this.hasEngine = hasEngine;
    }

    public void startEngine(){
        System.out.println("Key has been inserted and engine switched on!");
    }

    public void accelerate(int mph) {
        System.out.println("This car has accelerated to: " + mph);
    }

    public void brake() {
        System.out.println("Break pedal has been pressed");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }
}

 class ToyotaRav4 extends Car {

     public ToyotaRav4() {
         super(4, "ToyotaRav4");
     }

     @Override
     public void accelerate(int mph) {
         super.accelerate(mph);
     }
 }

 class Buick extends Car {
     public Buick() {
         super(6, "Buick");
     }

     @Override
     public void accelerate(int mph) {
         super.accelerate(mph);
     }
 }

 class HondaPilot extends Car {
     public HondaPilot() {
         super(4, "HondaPilot");
     }

     @Override
     public void accelerate(int mph) {
         super.accelerate(mph);
     }
 }

public class Main {

    public static void main(String[] args) {
        Car car = new ToyotaRav4();
        System.out.println("Name: " + car.getName() + "\n" + "Cylinders: " + car.getCylinders());
        car.accelerate(90);

        Car car1 = new Buick();
        System.out.println("Name: " + car1.getName() + "\n" + "Cylinders: " + car1.getCylinders());
        car1.accelerate(50);

        Car car2 = new HondaPilot();
        System.out.println("Name: " + car2.getName() + "\n" + "Cylinders: " + car2.getCylinders());
        car2.accelerate(120);


    }
}
