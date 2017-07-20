package com.epam.lab.patterns.DroidPrototype;

public class FighterDroid extends Droid {

    public static final String FIGHTER_DROID_NAME = "Fighter droid";
    private int damageValue;

    public FighterDroid(int id, int damageValue) {
        super(id);
        droidName = FIGHTER_DROID_NAME;
        this.damageValue = damageValue;
    }

    public void showDroidInfo() {
        System.out.println(String.format("%1$s with id %2$d which do damage by %3$d health points per hit", droidName, this.getId(), damageValue));
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
