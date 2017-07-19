package com.epam.lab.patterns.DroidDecorator;

/**
 * Created by Yulian on 7/19/2017.
 */
public class ChromArmoredDroid extends ArmoredDroidDecorator {
    public static final String armorType = "chromium ";
    public static final double armorTypeCost = 20000.0;

    public ChromArmoredDroid(Droid droid) {
        super(droid.droidInfo.concat(armorType), droid);
    }

    public double getCost() {
        return droid.getCost() + armorTypeCost;
    }
}
