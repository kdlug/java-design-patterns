package com.github.kdlug.command;

import com.github.kdlug.command.musicplayer.PlayFirstTrackCommand;
import com.github.kdlug.command.musicplayer.PlayNextTrackCommand;
import com.github.kdlug.command.musicplayer.PlayRandomTrackCommand;
import org.junit.Test;

public class MusicPlayerTest {
    @Test
    public void testWorkshop() {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}