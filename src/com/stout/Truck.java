package com.stout;

public class Truck implements IVehicle{
    public int numberOfWheels;
    public String licensePlateNumber;
    public String color;
    public double cost;
    IVehicle _iVehicle;

    public Truck() {}
    public void accelerate() {
        System.out.println("Truck is accelerating.");
    }

    @Override
    public void decelerate() {
        System.out.println("Truck is decelerating.");
    }

    @Override
    public void shareVehicleType() {
        System.out.println("I am a truck.");
    }
}
