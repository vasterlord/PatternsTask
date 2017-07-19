package com.epam.lab.patterns.DroidDecorator;


public abstract class ArmoredDroidDecorator extends Droid{

    protected Droid droid;

    public ArmoredDroidDecorator(String droidInfo, Droid droid) {
        super(droidInfo);
        this.droid = droid;
    }

}
