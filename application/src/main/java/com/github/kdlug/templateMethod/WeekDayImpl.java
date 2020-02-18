package com.github.kdlug.templateMethod;

public class WeekDayImpl extends WeekDay {
    @Override
    protected int goHome(TypeOfTransport transport) {
        switch (transport) {
            case TRAM:
                return 20;
            case BIKE:
                return 30;
            case CAR:
            default:
                return 40;
        }
    }

    @Override
    protected int goToWork(TypeOfTransport transport) {
        switch (transport) {
            case TRAM:
                return 10;
            case BIKE:
                return 30;
            case CAR:
            default:
                return 20;
        }
    }
}
