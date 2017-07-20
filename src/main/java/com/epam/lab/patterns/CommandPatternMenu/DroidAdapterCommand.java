package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidAdapter.*;

public class DroidAdapterCommand implements Command {

    public void execute() {

        //running droid
        RunningDroid runningDroid = new RunningDroid("Running droid");
        // wheeled chassis movement type on running droid
        WheeledChassis wheeledChassis = new WheeledChassis();
        // running droid go hiking
        runningDroid.goHiking(wheeledChassis);

        // met sands, you need to change running droid movement type to mechanical legs
        MechanicalLegs mechanicalLegs = new MechanicalLegs();
        // using droid movement type adapter
        MovementType legsMovementType = new DroidMovementTypeAdapter(mechanicalLegs);
        // continue the hiking through the desert sands
        runningDroid.goHiking(legsMovementType);
    }
}
