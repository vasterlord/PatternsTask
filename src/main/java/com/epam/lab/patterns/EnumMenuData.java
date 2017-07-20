package com.epam.lab.patterns;

public enum EnumMenuData {

    MENU_TITLE("                        MENU SELECTION              ", "0"),
    FIRST_OPTION("  1. Abstract droid factory ", "1"),
    SECOND_OPTION("  2. Droid factory method", "2"),
    THIRD_OPTION("  3. Droid decorator", "3"),
    FOURTH_OPTION("  4. Droid adapter", "4"),
    FIFE_OPTION("  5. Droid prototype", "5"),
    SIX_OPTION("  6. Exit", "6");

    private String optionTitle;

    private String optionNumber;

    EnumMenuData(String optionTitle, String optionNumber) {
        this.optionTitle = optionTitle;
        this.optionNumber = optionNumber;
    }

    public String getOptionTitle() {
        return optionTitle;
    }

    public String getOptionNumber() {
        return optionNumber;
    }

}
