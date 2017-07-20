package com.epam.lab.patterns.DroidFactoryMethod;


public class FlyDroid extends Droid {

    public static final double hitPoints = 60;
    private int armorValue = 1;

    public FlyDroid(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return String.format("Fly droid: id = %1$d, hit points = %2$.2f, armor = %3$d", id, hitPoints, armorValue);
    }
}
