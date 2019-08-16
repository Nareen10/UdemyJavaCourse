package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private ArrayList <Song> songs;
    private  String name;
    private String artist;

    public Album(String name, String artist) {
        this.songs = new ArrayList<>();
        this.artist=artist;
        this.name = name;
    }

    public boolean addNewSong (String title, double duration) {

        if (findSong(title) != null) {

            System.out.println("Song already exist in Album" + name);
            return false;
        }

        this.songs.add(new Song(title,duration));
        return true;
    }

    public boolean addToPlayList (int trackNumber, List<Song> playList){
        int index = trackNumber -1;

        if ((index >=0) && (index <=this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have the track " + trackNumber);
        return false;

    }

    public boolean addToPlayList (String title, List<Song> playList) {

        Song foundSong = findSong(title);
        if (foundSong != null) {
            playList.add(foundSong);
            return true;
        }

        System.out.println("This album does not have this title " + title);
        return false;


    }

    public boolean removeSong (String title) {

        Song tempSong = findSong(title);
        if (tempSong == null) {
            System.out.println("Song doesn't exist in Album " + name);
            return false;
        }

        this.songs.remove(tempSong);
        return true;
    }


    private Song findSong (String songTitle) {

        for (Song checkedSong : this.songs) {
            if (checkedSong.getSongTitle().equals(songTitle)) {
                return checkedSong;
            }
        }

        return null ;
    }
}