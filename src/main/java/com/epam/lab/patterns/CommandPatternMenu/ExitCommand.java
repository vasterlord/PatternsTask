package com.epam.lab.patterns.CommandPatternMenu;

public class ExitCommand implements Command{

    public void execute() {
        System.out.println("Bye, bye;)");
    }
}
