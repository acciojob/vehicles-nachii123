package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private String capacity;
    Vehicle vehicle;

    public Boat(String name, String capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return vehicle.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
