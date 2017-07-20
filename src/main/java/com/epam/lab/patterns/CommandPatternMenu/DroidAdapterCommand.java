package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidAdapter.*;
import org.apache.log4j.Logger;

public class DroidAdapterCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(DroidAdapterCommand.class);

    public void execute() {
        //running droid
        LOGGER.info("Running droid created.");
        RunningDroid runningDroid = new RunningDroid("Running droid");
        // wheeled chassis movement type on running droid
        LOGGER.info("Wheeled chassis movement type for droid created.");
        WheeledChassis wheeledChassis = new WheeledChassis();
        // running droid go hiking
        LOGGER.info("Droid moving on wheeled chassis movement type.");
        runningDroid.goHiking(wheeledChassis);

        // met sands, you need to change running droid movement type to mechanical legs
        LOGGER.info("Droid met sands and need to change his movement type to mechanical legs. Created mechanical legs.");
        MechanicalLegs mechanicalLegs = new MechanicalLegs();
        // using droid movement type adapter
        LOGGER.info("Adapt droid moving on mechanical legs movement type.");
        MovementType legsMovementType = new DroidMovementTypeAdapter(mechanicalLegs);
        // continue the hiking through the desert sands
        LOGGER.info("So, droid moving on  mechanical leg movement type after adapted.");
        runningDroid.goHiking(legsMovementType);
    }
}
