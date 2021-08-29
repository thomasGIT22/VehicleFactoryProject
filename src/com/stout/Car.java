package com.stout;

public class Car implements IVehicle {
    public int numberOfWheels;
    public String licensePlateNumber;
    public String color;
    public double cost;

    public Car(int numberOfWheels, String licensePlateNumber, String color, double cost) {
        this.numberOfWheels = numberOfWheels;
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.cost = cost;
    }

    public Car() {}

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void decelerate() {
        System.out.println("Car is decelerating.");
    }

    public void shareVehicleType() {
        System.out.println("I am a car.");
    }
}
