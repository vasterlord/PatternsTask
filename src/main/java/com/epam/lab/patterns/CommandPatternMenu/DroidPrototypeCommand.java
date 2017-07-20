package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidPrototype.Droid;
import com.epam.lab.patterns.DroidPrototype.FighterDroid;
import com.epam.lab.patterns.DroidPrototype.RepairDroid;

public class DroidPrototypeCommand implements Command {

    public void execute() {
        int fighterDroidId = 12948030;
        int newFighterDroidId = 45948730;
        int fighterDroidDamage = 7;
        Droid fighterDroid = new FighterDroid(fighterDroidId, fighterDroidDamage);
        Droid clonedFighterDroid = (Droid) fighterDroid.clone();
        fighterDroid.showDroidInfo();
        clonedFighterDroid.showDroidInfo();
        fighterDroid.setId(newFighterDroidId);
        clonedFighterDroid.showDroidInfo();

        int repearDroidId = 89076521;
        int newRepearDroidId = 10385496;
        int repairDroidRepearValue = 6;
        Droid repearDroid = new RepairDroid(repearDroidId, repairDroidRepearValue);
        Droid clonedRepearDroid = (Droid) repearDroid.clone();
        repearDroid.showDroidInfo();
        clonedRepearDroid.showDroidInfo();
        repearDroid.setId(newFighterDroidId);
        clonedRepearDroid.showDroidInfo();

    }

}
