package com.company;

import java.util.ArrayList;

public class Album {

    ArrayList <Song> songList;
    String albumName;

    public Album(String albumName) {
        this.songList = new ArrayList<>();
        this.albumName = albumName;
    }

    public boolean addNewSong (Song song) {

        if (findSong(song.songTitle) >=0) {
            
            System.out.println("Song already exist in Album" + albumName);
            return false;
        }

        this.songList.add(song);
        return true;
    }

    public boolean removeSong (Song song) {

        if (findSong(song.songTitle) < 0) {
            System.out.println("Song doesn't exist in Album " + albumName);
            return false;
        }

        this.songList.remove(song);
        return true;
    }


    public int findSong (String songTitle) {

        for (int i=0; i<songList.size(); i++) {
            Song tempSong = songList.get(i);
            if (tempSong.equals(songTitle)) {
                return i;
            }
        }

        return -1;
    }
}