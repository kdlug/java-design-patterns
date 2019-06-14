package com.github.kdlug.factory;

public abstract class InfantryUnit {
    /* health points */
    private int hp;
    /* experience level */
    private int exp;
    /* damage */
    private int dmg;

    // protected will disable possiblity to create InfantryUnit objects outside factory
    // InfantryUnit objects can be created only using factory
    protected InfantryUnit(int hp, int exp, int dmg) {
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

