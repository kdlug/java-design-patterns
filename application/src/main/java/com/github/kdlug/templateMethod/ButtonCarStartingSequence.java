package com.github.kdlug.templateMethod;

public class ButtonCarStartingSequence {
    public void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Push the gas pedal");
    }

    private void setTheGear() {
        System.out.println("Choose gear");
    }

    private void startTheIgnition() {
        System.out.println("Push the button");

    }

    private void fastenSeatbelts() {
        System.out.println("Fasten seatbelts");
    }
}

