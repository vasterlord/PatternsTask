package com.epam.lab.patterns.CommandPatternMenu;

import com.epam.lab.patterns.DroidDecorator.*;

public class DroidDecoratorCommand implements Command {

    public void execute() {
        Droid droid = new ArmoredDroid();
        droid = new MetalArmoredDroid(droid); //armored droid with metal additives
        outputDroidData(droid);

        droid = new ChromArmoredDroid(droid); //armored droid with metal, chromium additives
        outputDroidData(droid);

        droid = new TitaniumArmoredDroid(droid); //armored droid with metal, chromium, titanium additives
        outputDroidData(droid);
    }

    private void outputDroidData(Droid droid) {
        System.out.println(String.format("%s which cost %.2f", droid.getDroidInfo(), droid.getCost()));
    }

}
