package com.stout;

import java.util.concurrent.ThreadLocalRandom;

public class VehicleAttributes {

    public Car getCarWithAttributes() {
        return new Car(4, getRandomLicensePlate(), "Blue", 1000.00);
    }

    public Truck getTruckWithAttributes() {
        return new Truck(4, getRandomLicensePlate(), "Blue", 1000.00);
    }

    public Plane getPlaneWithAttributes() {
        return new Plane(4, getRandomLicensePlate(), "Red", 10000.00);
    }

    public String getRandomLicensePlate() {
        char[] licensePlate = {'a','b','c','-','1','2','3'};
        for (int firstThree = 0; firstThree < 3; firstThree++) {
            licensePlate[firstThree] = getRandomLicensePlateLetter();
        }
        for (int secondThree = 4; secondThree < 7; secondThree++) {
            licensePlate[secondThree] = getRandomLicensePlateNumber();
        }
        return String.copyValueOf(licensePlate);
    }

    private char getRandomLicensePlateNumber() {
        int low = 0;
        int high = 9;
        return (char) (ThreadLocalRandom.current().nextInt(low, high + 1) + '0');
    }

    public char getRandomLicensePlateLetter() {
        int low = 17;
        int high = 42;
        return (char) (ThreadLocalRandom.current().nextInt(low, high + 1) + '0');
    }
}
