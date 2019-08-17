package com.github.kdlug.command;

import com.github.kdlug.Robot;

public class RobotCutCommand implements Command {
    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
