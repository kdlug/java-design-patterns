package com.github.kdlug.factory;

public class Tank extends Unit {
    // default access, which means that only classes from the same package can creates objects
    Tank(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }
}
