package com.github.kdlug.strategy;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Cooking hard boiled egg");
    }
}
