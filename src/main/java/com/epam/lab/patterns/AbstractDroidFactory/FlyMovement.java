package com.epam.lab.patterns.AbstractDroidFactory;

public class FlyMovement implements Movement {

    public static final double movementSpeed = 200.0;

    public void Move() {
        System.out.println(String.format("Flying with movement speed %s km/h"));
    }
}
