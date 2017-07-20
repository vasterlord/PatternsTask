package com.epam.lab.patterns.DroidAdapter;

/**
 * Running droid go to hiking:
 * if he goes on the road he use wheeled chassis because it's faster
 * if on its way there is a desert or off-road he must change your movement type on mechanical legs
 * because wheeled chassis is't good for this
 */
public class RunningDroid {

    private String droidName;

    public RunningDroid(String droidName) {
        this.droidName = droidName;
    }

    public String getDroidName() {
        return droidName;
    }

    public void setDroidName(String droidName) {
        this.droidName = droidName;
    }

    public void goHiking(MovementType movementType) {
        movementType.move();
    }
}
