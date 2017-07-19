package com.epam.lab.patterns.DroidDecorator;


public abstract class Droid {

    protected String droidInfo;

    public Droid(String droidInfo) {
        this.droidInfo = droidInfo;
    }

    public abstract double getCost();
}
