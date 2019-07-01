package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here

        Album testAlbum = new Album("NareenAlbum", "Nareen");
        testAlbum.addNewSong("title1", 4.7);
        testAlbum.addNewSong("title2", 5.7);
        testAlbum.addNewSong("title3", 2.4);
        testAlbum.addNewSong("title4", 1.8);
        testAlbum.addNewSong("title5", 3.3);

        albums.add(testAlbum);


        Album testAlbum = new Album("NareenAlbum2", "Nareen2");
        testAlbum.addNewSong("title1", 4.7);
        testAlbum.addNewSong("title2", 5.7);
        testAlbum.addNewSong("title3", 2.4);
        testAlbum.addNewSong("title4", 1.8);
        testAlbum.addNewSong("title5", 3.3);

        albums.add(testAlbum);

        LinkedList<Song> playList = new LinkedList<>();



        albums.get(0).addToPlayList(1,playList);
        albums.get(1).addToPlayList("title1", playList);

        albums.get(0).addToPlayList(3,playList);
        albums.get(1).addToPlayList("title4", playList);

        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList("not title", playList);

        albums.get(0).addToPlayList(4,playList);
        albums.get(1).addToPlayList("title4", playList);


    }
}