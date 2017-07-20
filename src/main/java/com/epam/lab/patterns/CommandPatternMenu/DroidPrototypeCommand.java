package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidPrototype.Droid;
import com.epam.lab.patterns.DroidPrototype.FighterDroid;
import com.epam.lab.patterns.DroidPrototype.RepairDroid;
import org.apache.log4j.Logger;

public class DroidPrototypeCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(DroidPrototypeCommand.class);

    public void execute() {
        int fighterDroidId = 12948030;
        int newFighterDroidId = 45948730;
        int fighterDroidDamage = 7;

        LOGGER.info("Fighter droid created.");
        Droid fighterDroid = new FighterDroid(fighterDroidId, fighterDroidDamage);
        LOGGER.info("Fighter droid clone created.");
        Droid clonedFighterDroid = (Droid) fighterDroid.clone();
        LOGGER.info("Fighter droid show info.");
        fighterDroid.showDroidInfo();
        LOGGER.info("Fighter droid clone show info.");
        clonedFighterDroid.showDroidInfo();
        LOGGER.info("Fighter droid change id.");
        fighterDroid.setId(newFighterDroidId);
        LOGGER.info("Fighter droid clone show info again (data of clone didn't change).");
        clonedFighterDroid.showDroidInfo();

        int repairDroidId = 89076521;
        int newRepairDroidId = 10385496;
        int repairDroidRepearValue = 6;
        LOGGER.info("Repair droid created.");
        Droid repairDroid = new RepairDroid(repairDroidId, repairDroidRepearValue);
        LOGGER.info("Repair droid clone created.");
        Droid clonedRepearDroid = (Droid) repairDroid.clone();
        LOGGER.info("Repair droid show info.");
        repairDroid.showDroidInfo();
        LOGGER.info("Repair droid clone show info.");
        clonedRepearDroid.showDroidInfo();
        LOGGER.info("Repair droid change id.");
        repairDroid.setId(newRepairDroidId);
        LOGGER.info("Repair droid clone show info again (data of clone didn't change).");
        clonedRepearDroid.showDroidInfo();

    }

}
