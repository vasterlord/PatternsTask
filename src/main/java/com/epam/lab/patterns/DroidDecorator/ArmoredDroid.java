package com.epam.lab.patterns.DroidDecorator;

/**
 * Armored droid can be add different armor types such as titanium, chromium and more
 */
public class ArmoredDroid extends Droid{

    public static final int armoredDroidCost = 15000;

    public ArmoredDroid() {
        super("Armored droid made of: ");
    }

    public double getCost() {
        return armoredDroidCost;
    }
}
