package com.epam.lab.patterns.DroidFactoryMethod;

/**
 * Abstract class of droid manufacturing factory
 */
public abstract class DroidCreator {

    private String factoryName;

    public DroidCreator(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    // factory method
    public abstract Droid create(int id);
}
