package com.epam.lab.patterns.DroidFactoryMethod;


public class FlyDroid extends Droid {

    public static final double hitPoints = 60;

    public FlyDroid(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return String.format("Fly droid: id = %1$d, hit points = %12$d", id, hitPoints);
    }
}
