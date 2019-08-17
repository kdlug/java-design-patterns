package com.github.kdlug.command;

import com.github.kdlug.Robot;

public class RobotTurnOnCommand implements Command {
    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnOff();
    }
}
