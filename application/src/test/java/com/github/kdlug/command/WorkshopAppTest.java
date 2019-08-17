package com.github.kdlug.command;

import com.github.kdlug.CoffeeMaker;
import com.github.kdlug.Robot;
import com.github.kdlug.WorkshopApp;
import org.junit.Test;

public class WorkshopAppTest {
    @Test
    public void testWorkshop() {
        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();
        workshopApp.run();

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeeMaker));
        workshopApp.run();
        workshopApp.undoLastCommand();
    }
}