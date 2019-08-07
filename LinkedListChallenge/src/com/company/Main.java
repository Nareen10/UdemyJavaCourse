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
        testAlbum.addNewSong("title1", 234.3);
        testAlbum.addNewSong("title2", 35.32);
        testAlbum.addNewSong("title3", 65.4);
        testAlbum.addNewSong("title4", 245.834);
        testAlbum.addNewSong("title5", 131222.334);

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

    public static void printMenu() {

        System.out.println("==================================");

        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - remove current song");
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
            printMenu();

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
                    if (forward){
                        if(list.hasPrevious()){
                            System.out.println("Playing " + list.previous() + " again");
                            forward=false;
                        }
                        else {
                            System.out.println("We've reached the start of the list");
                        }
                    }
                    else {
                        if(list.hasNext()) {
                            System.out.println("Playing " + list.next() + " again");
                            forward = true;
                        }
                        else {
                            System.out.println("We've reached the end of the list");

                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() >0) {
                        list.remove();
                        if (list.hasNext()) {
                            System.out.println("Now playing from forward "+ list.next());
                           forward=true;
                        }
                        else if (list.hasPrevious()) {
                            System.out.println("Now playing from previous " + list.previous());
                           forward=false;
                        }
                    }
                    break;
            }




        }


    }
}