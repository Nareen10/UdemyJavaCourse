package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Album testAlbum = new Album("NareenAlbum");
        testAlbum.addNewSong(Song.createSong("song1", "2:34"));
        testAlbum.addNewSong(Song.createSong("song2", "2:25"));
        testAlbum.addNewSong(Song.createSong("song3", "4:52"));

        Album testAlbum2 = new Album("DeepaAlbum");
        testAlbum2.addNewSong(Song.createSong("song4", "2:25"));
        testAlbum2.addNewSong(Song.createSong("song5", "8:25"));
        testAlbum2.addNewSong(Song.createSong("song6", "1:52"));


    }
}