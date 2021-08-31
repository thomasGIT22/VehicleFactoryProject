package com.stout;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        ArrayList<IVehicle> vehicleList = vehicleFactory.getTenVehicles();


        for (IVehicle iVehicle : vehicleList) {
            System.out.println(iVehicle.toString());
        }

    }
}
