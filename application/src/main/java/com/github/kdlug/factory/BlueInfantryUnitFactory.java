package com.github.kdlug.factory;

public class BlueInfantryUnitFactory extends InfantryFactory {
    @Override
    public InfantryUnit createUnit(UnitType type) {
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
