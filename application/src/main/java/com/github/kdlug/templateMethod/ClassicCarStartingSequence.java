package com.github.kdlug.templateMethod;

public class ClassicCarStartingSequence extends CarStartingSequence{

    public void setTheGear() {
        System.out.println("Choose gear");
    }

    public void startTheIgnition() {
        System.out.println("Turn the key");
    }
}

