package com.epam.lab.patterns.DroidPrototype;

public class RepairDroid extends Droid {

    public static final String _REPAIR_DROID_NAME = "Repair droid";
    private int repairValue;

    public RepairDroid(int id, int repairValue) {
        super(id);
        this.droidName = _REPAIR_DROID_NAME;
        this.repairValue = repairValue;
    }

    public void showDroidInfo() {
        System.out.println(String.format("%1$s with id %2$d which do repairing by %3$d health points per action", droidName, this.getId(), repairValue));
    }

}
