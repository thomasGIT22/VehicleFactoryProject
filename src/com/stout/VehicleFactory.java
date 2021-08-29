package com.stout;

import java.util.ArrayList;
import java.util.Random;

public class VehicleFactory {
    static String[] _vehicleTypes = {"Car", "Truck", "Plane"};

    public int getVehicleLength() {
        return _vehicleTypes.length;
    }

    public IVehicle getVehicle(String input) {
        if(input == "Car") {
            return new Car();
        } else if(input == "Truck") {
            return new Truck();
        }
        else return new Plane();
    }

    public ArrayList<IVehicle> getTenVehicles() {
        ArrayList<IVehicle> vehicles = new ArrayList<IVehicle>();
        for(int i = 0; i < 10; i++) {
            vehicles.add(getVehicle(_vehicleTypes[getRandomVehicleIndex()]));
        }
        return vehicles;
    }

    public int getRandomVehicleIndex(){
        Random random = new Random();
        int range = _vehicleTypes.length - 1;
        return random.nextInt(range);
    }

}
