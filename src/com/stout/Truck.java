package com.stout;

public class Truck implements IVehicle {
    public int numberOfWheels;
    public String licensePlateNumber;
    public String color;
    public double cost;

    public Truck(int numberOfWheels, String licensePlateNumber, String color, double cost) {
        this.numberOfWheels = numberOfWheels;
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.cost = cost;
    }

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

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels=" + numberOfWheels +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
