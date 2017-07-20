package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidDecorator.*;
import org.apache.log4j.Logger;

public class DroidDecoratorCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(DroidDecoratorCommand.class);

    public void execute() {
        Droid droid = new ArmoredDroid();
        LOGGER.info("Armored droid with metal, additives.");
        droid = new MetalArmoredDroid(droid); //armored droid with metal additives
        outputDroidData(droid);

        LOGGER.info("Armored droid with metal, chromium additives.");
        droid = new ChromArmoredDroid(droid); //armored droid with metal, chromium additives
        outputDroidData(droid);

        LOGGER.info("Armored droid with metal, chromium, titanium additives.");
        droid = new TitaniumArmoredDroid(droid); //armored droid with metal, chromium, titanium additives
        outputDroidData(droid);
    }

    private void outputDroidData(Droid droid) {
        System.out.println(String.format("%s which cost %.2f", droid.getDroidInfo(), droid.getCost()));
    }

}
