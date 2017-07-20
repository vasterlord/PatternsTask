package com.epam.lab.patterns.DroidDecorator;


public class MetalArmoredDroid extends ArmoredDroidDecorator {

    public static final String armorType = " metal";
    public static final double armorTypeCost = 5000.0;

    public MetalArmoredDroid(Droid droid) {
        super(droid.getDroidInfo().concat(armorType), droid);
    }

    public double getCost() {
        return droid.getCost() + armorTypeCost;
    }
}
