package com.epam.lab.patterns.AbstractDroidFactory;

/**
 * Factory creating a running droid with a laser sword
 */
public class GroundCombatDroidFactory extends DroidFactory {

    public Movement CreateMovement() {
        return new RunMovement();
    }

    public Weapon CreateWeapon() {
        return new LaserSword();
    }
}
