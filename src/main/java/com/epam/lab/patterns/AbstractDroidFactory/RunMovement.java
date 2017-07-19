package com.epam.lab.patterns.AbstractDroidFactory;

public class RunMovement implements Movement {

    public static final double movementSpeed = 80.0;

    public void Move() {
        System.out.println(String.format("Run with movement speed %s km/h"));
    }
}
