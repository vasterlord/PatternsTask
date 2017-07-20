package com.epam.lab.patterns.DroidAdapter;

public class MechanicalLegs implements MovementType{

    public static final double movementSpeed = 50.0;

    public void move() {
        System.out.printf(String.format("Moving on mechanical legs with movement speed %s km/h", movementSpeed));
    }
}
