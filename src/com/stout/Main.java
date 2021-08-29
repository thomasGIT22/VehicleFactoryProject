package com.stout;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	    VehicleFactory vehicleFactory = new VehicleFactory();

	    ArrayList<IVehicle> vehicleList = new ArrayList<IVehicle>(10);

	    vehicleList = vehicleFactory.getTenVehicles();

        for (int i = 0; i < 10; i++) {
            vehicleList.get(i).shareVehicleType();
            vehicleList.get(i).accelerate();
            System.out.println();
        }
    }
}
