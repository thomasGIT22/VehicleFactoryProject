package com.stout;

import java.util.concurrent.ThreadLocalRandom;

public class VehicleAttributes {

    public Car getCarWithAttributes() {
        return new Car(getRandomLicensePlate(), getRandomColor(), getRandomYear(),
                "Toyota", "Camry");
    }

    public Truck getTruckWithAttributes() {
        return new Truck(getRandomLicensePlate(), getRandomColor(), getRandomYear(),
                "Chevrolet", "Silverado");
    }

    public Plane getPlaneWithAttributes() {
        return new Plane(getRandomLicensePlate(), getRandomColor(), getRandomYear(),
                "Boeing", "737");
    }

    public String getRandomLicensePlate() {
        char[] licensePlate = {'a','b','c','-','1','2','3'};
        for (int firstThree = 0; firstThree < 3; firstThree++) {
            licensePlate[firstThree] = getRandomLicensePlateLetter();
        }
        for (int lastThree = 4; lastThree < 7; lastThree++) {
            licensePlate[lastThree] = getRandomLicensePlateNumber();
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

    public String getRandomColor() {
        String[] colors = {"Black", "White", "Blue", "Red", "Green", "Yellow",
        "Purple", "Orange", "Brown", "Gray" };
        return colors[ThreadLocalRandom.current().nextInt(0, colors.length)];
    }

    public int getRandomYear() {
        return ThreadLocalRandom.current().nextInt(1998, 2021);
    }
}
