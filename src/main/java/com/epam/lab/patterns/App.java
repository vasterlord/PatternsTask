package com.epam.lab.patterns;

import com.epam.lab.patterns.CommandPatternMenu.*;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menuChoice = EnumMenuData.MENU_TITLE.getOptionNumber();
        MenuControl menuControl = new MenuControl();
        setMenuControlCommands(menuControl);
        while (!menuChoice.equalsIgnoreCase(EnumMenuData.SIX_OPTION.getOptionNumber())) {
            printMenuSelectionOptions();
            menuChoice = scanner.next();
            if (menuChoice.equalsIgnoreCase(EnumMenuData.FIRST_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.FIRST_OPTION.getOptionNumber());
            } else if (menuChoice.equalsIgnoreCase(EnumMenuData.SECOND_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.SECOND_OPTION.getOptionNumber());
            } else if (menuChoice.equalsIgnoreCase(EnumMenuData.THIRD_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.THIRD_OPTION.getOptionNumber());
            } else if (menuChoice.equalsIgnoreCase(EnumMenuData.FOURTH_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.FOURTH_OPTION.getOptionNumber());
            } else if (menuChoice.equalsIgnoreCase(EnumMenuData.FIFE_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.FIFE_OPTION.getOptionNumber());
            }  else if (menuChoice.equalsIgnoreCase(EnumMenuData.SIX_OPTION.getOptionNumber())) {
                menuControl.runCommand(EnumMenuData.SIX_OPTION.getOptionNumber());
                LOGGER.info("Program exit.");
            } else {
                menuControl.runCommand(EnumMenuData.MENU_TITLE.getOptionNumber());
            }
        }
    }

    private static void setMenuControlCommands(MenuControl menuControl) {
        menuControl.setCommand(EnumMenuData.FIRST_OPTION.getOptionNumber(), new AbstractFactoryCommand());
        menuControl.setCommand(EnumMenuData.SECOND_OPTION.getOptionNumber(), new FactoryMethodCommand());
        menuControl.setCommand(EnumMenuData.THIRD_OPTION.getOptionNumber(), new DroidDecoratorCommand());
        menuControl.setCommand(EnumMenuData.FOURTH_OPTION.getOptionNumber(), new DroidAdapterCommand());
        menuControl.setCommand(EnumMenuData.FIFE_OPTION.getOptionNumber(), new DroidPrototypeCommand());
        menuControl.setCommand(EnumMenuData.SIX_OPTION.getOptionNumber(), new ExitCommand());
        menuControl.setCommand(EnumMenuData.MENU_TITLE.getOptionNumber(), new ErrorMenuSelectionCommand());
    }

    public static void printMenuSelectionOptions() {
        System.out.println(EnumMenuData.MENU_TITLE.getOptionTitle());
        System.out.println(EnumMenuData.FIRST_OPTION.getOptionTitle());
        System.out.println(EnumMenuData.SECOND_OPTION.getOptionTitle());
        System.out.println(EnumMenuData.THIRD_OPTION.getOptionTitle());
        System.out.println(EnumMenuData.FOURTH_OPTION.getOptionTitle());
        System.out.println(EnumMenuData.FIFE_OPTION.getOptionTitle());
        System.out.println(EnumMenuData.SIX_OPTION.getOptionTitle());
        System.out.print("Please enter some choice number : ");
    }
}
