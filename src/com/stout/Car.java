package com.stout;

public class Car implements IVehicle {
    private String licensePlateNumber;
    private String color;
    private int year;

    public Car(String licensePlateNumber, String color, int year) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
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
                '}';
    }
}
