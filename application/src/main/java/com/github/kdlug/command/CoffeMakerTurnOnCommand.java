package com.github.kdlug.command;

import com.github.kdlug.CoffeeMaker;

public class CoffeMakerTurnOnCommand implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
