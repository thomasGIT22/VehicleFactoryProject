package com.stout;

import java.util.ArrayList;
import java.util.Random;

public class VehicleFactory {
    static String[] _vehicleTypes = {"Car", "Truck", "Plane"};
    static VehicleAttributes _vehicleAttributes = new VehicleAttributes();

    public int getVehicleListLength() {
        return _vehicleTypes.length;
    }

    public Car getCar() {
        return _vehicleAttributes.getCarWithAttributes();
    }

    public Truck getTruck() {
        return _vehicleAttributes.getTruckWithAttributes();
    }

    public Plane getPlane() {
        return _vehicleAttributes.getPlaneWithAttributes();
    }

    public ArrayList<IVehicle> getTenVehicles() {
        ArrayList<IVehicle> vehicles = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            String randomVehicle = getRandomVehicleType();
            if (randomVehicle.equals("Car")) {
                vehicles.add(getCar());
            } else if (randomVehicle.equals("Truck")) {
                vehicles.add(getTruck());
            } else vehicles.add(getPlane());
        }
        return vehicles;
    }

    private String getRandomVehicleType() {
        return _vehicleTypes[getRandomVehicleIndex()];
    }

    public int getRandomVehicleIndex() {
        Random random = new Random();
        return random.nextInt(getVehicleListLength());
    }

}
