package com.github.kdlug.command;

import com.github.kdlug.command.musicplayer.MusicPlayerCommand;

public class MusicPlayerRemote {
    private MusicPlayerCommand command;

    public void setMusicPlayerCommand(MusicPlayerCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.play();
    }
}
