package com.epam.lab.patterns.DroidFactoryMethod;

public class GroundDroid extends Droid {

    public static final double hitPoints = 100;
    private int armorValue = 10;

    public GroundDroid(int id) {
        super(id);
        this.armorValue = armorValue;
    }

    @Override
    public String toString() {
        return String.format("Ground droid: id = %1$d, hit points = %2$.2f, armor = %3$d", id, hitPoints, armorValue);
    }
}
