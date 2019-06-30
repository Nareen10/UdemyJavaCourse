package com.company;

public class Song {

    String songTitle;
    String songDuration;

    public Song(String songTitle, String songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public static Song createSong (String songTitle, String songDuration) {
        return new Song(songTitle, songDuration);
    }
}