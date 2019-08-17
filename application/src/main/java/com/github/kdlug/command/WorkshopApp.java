package com.github.kdlug.command;

/**
 * The type Workshop app.
 */
public class WorkshopApp {
    private Robot robot;

    /**
     * Instantiates a new Workshop app.
     *
     * @param robot the robot
     */
    public WorkshopApp(Robot robot) {
        this.robot = robot;
    }

    /**
     * Run.
     */
    public void run() {
        robot.turnOn();
        robot.cut();
        robot.drill();
        robot.turnOff();
    }
}
