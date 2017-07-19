package com.epam.lab.patterns.AbstractDroidFactory;

public class LaserSword implements Weapon {
        public static final int damage = 15;

    public void hit() {
        System.out.println(String.format("Hitting from laser sword by %s damage per hit", damage));
    }
}
