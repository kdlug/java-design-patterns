package com.github.kdlug.command;

import org.junit.Test;

public class WorkshopAppTest {
    @Test
    public void testWorkshop() {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}