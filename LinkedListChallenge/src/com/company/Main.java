package com.company;

import java.util.*;

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


        testAlbum = new Album("NareenAlbum2", "Nareen2");
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
        albums.get(1).addToPlayList("Negative Album", playList);

        albums.get(0).addToPlayList(4,playList);
        albums.get(1).addToPlayList("title4", playList);

        play(playList);


    }

    private static void printList (LinkedList<Song> playList) {

        Iterator list = playList.iterator();
        int counter =0;

        while (list.hasNext()) {
            counter++;
            System.out.println(counter + ". " + list.next().toString());
        }

        System.out.println("==================================");

    }

    public static void play (LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        ListIterator list = playList.listIterator();
        boolean quit = false;
        boolean forward = true;


        if (playList.isEmpty()) {
            System.out.println("There is no songs in the playlist");
            return;
        } else {
            System.out.println("Now playing ..." + list.next().toString());
        }

        while (!quit) {

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)  {
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                      if (list.hasNext()) {
                          list.next();
                      }
                      forward=true;
                    }
                    if (list.hasNext()) {
                        System.out.println("Playing " + list.next().toString());
                    }
                    else {
                        System.out.println("We've reached the end of the list");
                        forward=false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if(list.hasPrevious()){
                            list.previous();
                        }
                        forward=false;
                    }
                    if (list.hasPrevious()) {
                        System.out.println("Playing " + list.previous().toString());
                    }
                    else {
                        System.out.println("We've reached the start of the list");
                        forward=true;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }




        }


    }
}