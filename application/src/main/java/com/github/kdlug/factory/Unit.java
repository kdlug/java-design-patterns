package com.github.kdlug.factory;

public abstract class Unit {
    /* health points */
    private int hp;
    /* experience level */
    private int exp;
    /* damage */
    private int dmg;

    // protected will disable possiblity to create Unit objects outside factory
    // Unit objects can be created only using factory
    protected Unit(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmg() {
        return dmg;
    }
}

