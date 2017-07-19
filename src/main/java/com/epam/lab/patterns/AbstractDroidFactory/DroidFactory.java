package com.epam.lab.patterns.AbstractDroidFactory;

/**
 * Abstract droid factory class
 */
public abstract class DroidFactory {

    public abstract Movement CreateMovement();
    public abstract Weapon CreateWeapon();

}
