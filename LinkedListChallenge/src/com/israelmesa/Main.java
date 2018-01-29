package com.israelmesa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Bass on Top", "Paul Chambers");
        album.addSong("Yesterdays", 05.53);
        album.addSong("You'd Be So Nice to Come Home To", 07.16);
        album.addSong("Chasin' the Bird", 06.18);
        album.addSong("Dear Old Stockholm", 06.44);
        album.addSong("The Theme", 06.15);
        album.addSong("Confessin", 04.13);
        album.addSong("Chamber Mates", 05.08);
        albums.add(album);

        album = new Album("We Three", "Paul Chambers");
        album.addSong("Sugar Ray", 06.25);
        album.addSong("Solitaire", 08.54);
        album.addSong("After Hours", 11.24);
        album.addSong("Sneakin' Around", 04.24);
        album.addSong("Our Delight", 06.15);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Yesterdays", playList);
        albums.get(0).addToPlaylist("You'd Be So Nice to Come Home To", playList);
        albums.get(0).addToPlaylist("Confessin", playList);
        albums.get(0).addToPlaylist("Solitaire", playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(7, playList);
        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
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
