package com.github.kdlug.builder;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    // parameter should implements HouseBuilder interface
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
