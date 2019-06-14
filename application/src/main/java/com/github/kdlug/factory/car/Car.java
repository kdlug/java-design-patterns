package com.github.kdlug.factory.car;

public abstract class Car {
    private int engineCapacity;
    private String fuelType;
    private int productionYear;
    private String steeringWheelPosition;

    protected Car(int engineCapacity, String fuelType, int productionYear, String steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
