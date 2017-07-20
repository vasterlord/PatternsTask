package com.epam.lab.patterns.DroidDecorator;


public class TitaniumArmoredDroid extends ArmoredDroidDecorator {

    public static final String armorType = "titan";
    public static final double armorTypeCost = 15000.0;

    public TitaniumArmoredDroid(Droid droid) {
        super(droid.getDroidInfo().concat(armorType), droid);
    }

    public double getCost() {
        return droid.getCost() + armorTypeCost;
    }
}
