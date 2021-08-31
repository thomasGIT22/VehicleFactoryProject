package com.stout;

public class Plane implements IVehicle {
    public int numberOfWheels;
    public String licensePlateNumber;
    public String color;
    public double cost;

    public Plane(int numberOfWheels, String licensePlateNumber, String color, double cost) {
        this.numberOfWheels = numberOfWheels;
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.cost = cost;
    }

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

    @Override
    public String toString() {
        return "Plane{" +
                "numberOfWheels=" + numberOfWheels +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
