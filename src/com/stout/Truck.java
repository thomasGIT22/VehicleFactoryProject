package com.stout;

public class Truck implements IVehicle {
    public String licensePlateNumber;
    public String color;
    public int year;

    public Truck(String licensePlateNumber, String color, int year) {
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
        this.year = year;
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
                '}';
    }
}
