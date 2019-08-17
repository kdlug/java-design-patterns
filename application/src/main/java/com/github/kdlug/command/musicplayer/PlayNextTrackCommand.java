package com.github.kdlug.command.musicplayer;

import com.github.kdlug.command.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand {
    private MusicPlayer musicPlayer;

    public PlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
