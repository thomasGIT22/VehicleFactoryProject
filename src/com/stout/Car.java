package com.stout;

public class Car implements IVehicle {
    private String licensePlateNumber;
    private String color;
    private int year;
    private String make;
    private String model;

    public Car(String licensePlateNumber, String color, int year, String make,
               String model) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
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
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", make=" + make +
                ", model=" + model +
                '}';
    }
}
