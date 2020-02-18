package com.github.kdlug.templateMethod;

public abstract class CarStartingSequence {
    // It's final because inherited classes should implement only some steps
    // Steps sequence should be unchangeable
    public final void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    protected abstract void setTheGear();

    protected abstract void startTheIgnition();

    private void fastenSeatbelts() {
        System.out.println("Fasten seatbelts");
    }

    private void go() {
        System.out.println("Push the gas pedal");
    }
}
