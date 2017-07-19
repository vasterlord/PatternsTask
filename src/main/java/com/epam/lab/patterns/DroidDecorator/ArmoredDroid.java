package com.epam.lab.patterns.DroidDecorator;

/**
 *
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
