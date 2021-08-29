package com.stout;

public class Plane implements IVehicle {
    public int numberOfWheels;
    public String licensePlateNumber;
    public String color;
    public double cost;
    IVehicle _iVehicle;

    public Plane() {}

    @Override
    public void accelerate() {
        System.out.println("Plane is accelerating.");
    }

    @Override
    public void decelerate() {
        System.out.println("Plane is decelerating.");
    }

    @Override
    public void shareVehicleType() {
        System.out.println("I am a plane.");
    }

    public void fly() {
        System.out.println("Plane is flying.");
    }
}
