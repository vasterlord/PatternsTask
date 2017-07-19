package com.epam.lab.patterns.AbstractDroidFactory;

/**
 * Factory creating a flying droid with a laser gun
 */
public class AirCombatDroidFactory extends DroidFactory {

    public Movement CreateMovement() {
        return new FlyMovement();
    }

    public Weapon CreateWeapon() {
        return new LaserGun();
    }
}
