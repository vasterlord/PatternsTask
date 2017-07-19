package com.epam.lab.patterns.AbstractDroidFactory;


public class LaserGun implements Weapon {
     public static final int damage = 10;

    public void Hit() {
        System.out.println(String.format("Shooting from laser gun by %s damage per shot", damage));
    }
}
