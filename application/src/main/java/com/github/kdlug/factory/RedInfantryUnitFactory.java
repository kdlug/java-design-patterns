package com.github.kdlug.factory;

public class RedInfantryUnitFactory extends InfantryFactory {
    @Override
    public InfantryUnit createUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20,0,6);
            default:
                throw new UnsupportedOperationException("No such unit type");
        }
    }
}
