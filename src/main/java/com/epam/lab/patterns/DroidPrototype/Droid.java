package com.epam.lab.patterns.DroidPrototype;

import org.apache.log4j.Logger;

public abstract class Droid implements Cloneable {

    private static final Logger LOGGER = Logger.getLogger(Droid.class);
    private int id;
    protected String droidName;

    public Droid(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object clone() {
        Object droidClone = null;

        try {
            droidClone = super.clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
        return droidClone;
    }

    public abstract void showDroidInfo();
}
