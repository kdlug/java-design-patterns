package com.github.kdlug.command;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<String> tracks = Arrays.asList("Track1", "Track2", "Track3");
    Integer currentTrackNumber = 0;

    public void playFirstTrack() {
        currentTrackNumber = 0;

        System.out.println("Playing first track: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > tracks.size() -1) {
            currentTrackNumber = 0;
        }

        System.out.println("Playing next track: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random rand = new Random();
        currentTrackNumber = rand.nextInt(tracks.size() - 1);

        System.out.println("Playing random track: " + tracks.get(currentTrackNumber));
    }
}
