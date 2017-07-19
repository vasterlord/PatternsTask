package com.epam.lab.patterns.DroidFactoryMethod;


public abstract class Droid {

    protected int id;

    public Droid(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
