package com.stout;

public class Car implements IVehicle {
    private int numberOfWheels;
    private String licensePlateNumber;
    private String color;
    private double cost;

    public Car(int numberOfWheels, String licensePlateNumber, String color, double cost) {
        this.numberOfWheels =numberOfWheels;
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.cost = cost;
    }

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

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
