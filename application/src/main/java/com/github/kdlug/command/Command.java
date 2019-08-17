package com.github.kdlug.command;

public interface Command {
    void execute();
    void undo();
}
