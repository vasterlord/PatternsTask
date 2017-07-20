package com.epam.lab.patterns.DroidFactoryMethod;

/**
 * Creates ground droids
 */
public class GroundDroidCreator extends DroidCreator {

    public GroundDroidCreator(String factoryName) {
        super(factoryName);
    }

    public Droid create(int id) {
        return new GroundDroid(id);
    }
}
