package com.github.kdlug.command.musicplayer;

import com.github.kdlug.command.MusicPlayer;

public class PlayFirstTrackCommand implements MusicPlayerCommand {
    private MusicPlayer musicPlayer;

    public PlayFirstTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
