package com.github.kdlug.factory;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(05, 0, 65);
            default:
                throw new UnsupportedOperationException("Invalid UnitType");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Invalid UnitType");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helocopter(80, 0, 45);
            default:
                throw new UnsupportedOperationException("Invalid UnitType");
        }
    }

}
