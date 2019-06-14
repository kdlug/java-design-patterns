package com.github.kdlug.factory;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(3, 0,50);
            case RIFLEMAN:
                return new Rifleman(100,0,200);
            default:
                throw new UnsupportedOperationException("No such unit type");
        }
    }
}
