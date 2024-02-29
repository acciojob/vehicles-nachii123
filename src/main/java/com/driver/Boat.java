package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private String capacity;
    Vehicle vehicle;

    @Override
    public String getVehicleName() {
        return vehicle.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
