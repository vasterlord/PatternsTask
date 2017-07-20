package com.epam.lab.patterns.DroidFactoryMethod;

/**
 * Creates fly droids
 */
public class FlyDroidCreator extends DroidCreator {

    public FlyDroidCreator(String factoryName) {
        super(factoryName);
    }

    public Droid create(int id) {
        return new FlyDroid(id);
    }
}
