package com.epam.lab.patterns.DroidDecorator;


public abstract class Droid {

    private String droidInfo;

    public Droid(String droidInfo) {
        this.droidInfo = droidInfo;
    }

    public abstract double getCost();

    public String getDroidInfo() {
        return droidInfo;
    }

    public void setDroidInfo(String droidInfo) {
        this.droidInfo = droidInfo;
    }
}
