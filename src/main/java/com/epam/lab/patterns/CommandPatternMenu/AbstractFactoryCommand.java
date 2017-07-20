package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.AbstractDroidFactory.AirCombatDroidFactory;
import com.epam.lab.patterns.AbstractDroidFactory.Droid;
import com.epam.lab.patterns.AbstractDroidFactory.GroundCombatDroidFactory;
import org.apache.log4j.Logger;

public class AbstractFactoryCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(AbstractFactoryCommand.class);

    public void execute() {
        Droid groundCombatDroid = new Droid(new GroundCombatDroidFactory());
        LOGGER.info("Ground combat droid created. He is hitting and running");
        groundCombatDroid.hit();
        groundCombatDroid.run();

        LOGGER.info("Fly combat droid created. He is hitting and flying");
        Droid airCombatDroid = new Droid(new AirCombatDroidFactory());
        airCombatDroid.hit();
        airCombatDroid.run();
    }
}
