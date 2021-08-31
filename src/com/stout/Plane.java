package com.stout;

public class Plane implements IVehicle {
    public String licensePlateNumber;
    public String color;
    public int year;
    private String make;
    private String model;

    public Plane(String licensePlateNumber, String color, int year, String make,
                 String model) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
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
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", make=" + make +
                ", model=" + model +
                '}';
    }
}
