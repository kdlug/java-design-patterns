package com.github.kdlug;

import com.github.kdlug.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Workshop app.
 */
public class WorkshopApp {
    private List<Command> commandQueue = new ArrayList<Command>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Queue is empty");
        }

        for (Command command : commandQueue) {
            command.execute();
        }

        // clear queue
   //     commandQueue.clear();
    }

    public void undoLastCommand() {
        for (Command command : commandQueue) {
            command.undo();
        }
    }
}
