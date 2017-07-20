package com.epam.lab.patterns.DroidAdapter;

public class WheeledChassis implements MovementType{

    public static final double movementSpeed = 100.0;

    public void move() {
        System.out.println(String.format("Moving on wheeled chassis with movement speed %s km/h", movementSpeed));
    }
}
