package com.epam.lab.patterns.DroidFactoryMethod;

/**
 * Creates ground droids
 */
public class GroundDroidCreator extends DroidFactory {

    public GroundDroidCreator(String factoryName) {
        super(factoryName);
    }

    public Droid create(int id) {
        return new FlyDroid(id);
    }
}
