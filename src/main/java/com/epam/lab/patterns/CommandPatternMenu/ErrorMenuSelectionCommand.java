package com.epam.lab.patterns.CommandPatternMenu;

import org.apache.log4j.Logger;

public class ErrorMenuSelectionCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(ErrorMenuSelectionCommand.class);

    public void execute() {
        LOGGER.warn("Such button does`t exist, please try again!");
    }
}
