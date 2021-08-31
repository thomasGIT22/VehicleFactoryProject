package com.stout;

public class Plane implements IVehicle {
    public String licensePlateNumber;
    public String color;
    public int year;

    public Plane(String licensePlateNumber, String color, int year) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
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
                '}';
    }
}
