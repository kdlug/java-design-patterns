package com.github.kdlug.factory;

public class Rifleman extends InfantryUnit {
    // default access, which means that only classes from the same package can creates objects
    Rifleman(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }
}
