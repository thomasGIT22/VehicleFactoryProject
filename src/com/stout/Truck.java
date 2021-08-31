package com.stout;

public class Truck implements IVehicle {
    public String licensePlateNumber;
    public String color;
    public int year;
    private String make;
    private String model;

    public Truck(String licensePlateNumber, String color, int year, String make,
                 String model) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
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
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", make=" + make +
                ", model=" + model +
                '}';
    }
}
