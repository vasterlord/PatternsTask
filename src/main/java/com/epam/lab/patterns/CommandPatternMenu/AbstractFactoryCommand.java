package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.AbstractDroidFactory.AirCombatDroidFactory;
import com.epam.lab.patterns.AbstractDroidFactory.Droid;
import com.epam.lab.patterns.AbstractDroidFactory.GroundCombatDroidFactory;

public class AbstractFactoryCommand implements Command {

    public void execute() {
        Droid groundCombatDroid = new Droid(new GroundCombatDroidFactory());
        groundCombatDroid.hit();
        groundCombatDroid.run();

        Droid airCombatDroid = new Droid(new AirCombatDroidFactory());
        airCombatDroid.hit();
        airCombatDroid.run();
    }
}
