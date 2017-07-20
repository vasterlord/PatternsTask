package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidFactoryMethod.Droid;
import com.epam.lab.patterns.DroidFactoryMethod.DroidCreator;
import com.epam.lab.patterns.DroidFactoryMethod.FlyDroidCreator;
import com.epam.lab.patterns.DroidFactoryMethod.GroundDroidCreator;
import org.apache.log4j.Logger;

public class FactoryMethodCommand implements Command  {

    private static final Logger LOGGER = Logger.getLogger(FactoryMethodCommand.class);
    private static int INITIAL_DROID_ID = 1;

    public void execute() {
        LOGGER.info("Create a some company/corp/inc/ or smt else that creates ground droid");
        DroidCreator droidCreator = new GroundDroidCreator("Ground Droid Inc");
        LOGGER.info("Creating ground droid by Ground Droid Inc");
        Droid groundDroid = droidCreator.create(INITIAL_DROID_ID);
        LOGGER.info("Show info about created ground droid by Ground Droid Inc");
        System.out.println(groundDroid.toString());

        LOGGER.info("Create a some company/corp/inc/ or smt else that creates fly droid");
        droidCreator = new FlyDroidCreator("Fly Droid corporation");
        LOGGER.info("Creating fly droid by Fly Droid corporation");
        Droid flyDroid = droidCreator.create(INITIAL_DROID_ID++);
        LOGGER.info("Show info about created fly droid by Fly Droid corporation");
        System.out.println(flyDroid.toString());
    }
}
