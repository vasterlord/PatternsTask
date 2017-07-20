package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidFactoryMethod.Droid;
import com.epam.lab.patterns.DroidFactoryMethod.DroidCreator;
import com.epam.lab.patterns.DroidFactoryMethod.FlyDroidCreator;
import com.epam.lab.patterns.DroidFactoryMethod.GroundDroidCreator;

public class FactoryMethodCommand implements Command  {

    private static int INITIAL_DROID_ID = 1;

    public void execute() {
        DroidCreator droidCreator = new GroundDroidCreator("Ground droid Inc");
        Droid groundDroid = droidCreator.create(INITIAL_DROID_ID);
        System.out.println(groundDroid.toString());

        droidCreator = new FlyDroidCreator("Fly droid corporation");
        Droid flyDroid = droidCreator.create(INITIAL_DROID_ID++);
        System.out.println(flyDroid.toString());
    }
}
