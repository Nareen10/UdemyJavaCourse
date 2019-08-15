package com.company;

public class Song {

    private String songTitle;
    private Double songDuration;

    public Song(String songTitle, Double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public Double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return this.songTitle + " : " + this.songDuration;
    }

    public static Song createSong (String songTitle, Double songDuration) {
        return new Song(songTitle, songDuration);
    }
}