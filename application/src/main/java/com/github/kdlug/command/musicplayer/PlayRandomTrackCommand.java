package com.github.kdlug.command.musicplayer;

import com.github.kdlug.command.MusicPlayer;

public class PlayRandomTrackCommand implements MusicPlayerCommand {
    private MusicPlayer musicPlayer;

    public PlayRandomTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
