package com.epam.lab.patterns.AbstractDroidFactory;

/**
 * Client - himself a droid
 */
public class Droid {

     private Movement movement;
     private Weapon weapon;

    public Droid(DroidFactory droidFactory) {
        this.movement = droidFactory.CreateMovement();
        this.weapon = droidFactory.CreateWeapon();
    }

    public void run(){
        movement.move();
    }

    public void hit() {
        weapon.hit();
    }
}
