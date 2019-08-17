package com.github.kdlug.command;

import com.github.kdlug.CoffeeMaker;

public class CoffeMakerTurnOffCommand implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOn();
    }
}
