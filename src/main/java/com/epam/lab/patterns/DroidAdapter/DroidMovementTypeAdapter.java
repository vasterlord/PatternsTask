package com.epam.lab.patterns.DroidAdapter;

/**
 * Adapter from running droid on chassis to running droid on legs
 */

public class DroidMovementTypeAdapter implements MovementType {

    private MechanicalLegs mechanicalLegs;

    public DroidMovementTypeAdapter(MechanicalLegs mechanicalLegs) {
        this.mechanicalLegs = mechanicalLegs;
    }

    public void move() {
        mechanicalLegs.move();
    }
}
