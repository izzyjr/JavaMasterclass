package com.israelmesa;

import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Bass on Top", "Paul Chambers");
        album.addSong("You'd Be So Nice to Come Home To", 07.16);
        album.addSong("Chasin' the Bird", 06.18);
        album.addSong("Dear Old Stockholm", 06.44);
        album.addSong("The Theme", 06.15);
        album.addSong("Confessin", 04.13);
        album.addSong("Chamber Mates", 05.08);
        album.addSong("Yesterdays", 05.53);
        albums.add(album);

        album = new Album("Soultrane", "John Coltrane");
        album.addSong("Good Bait", 12.08);
        album.addSong("I Want to Talk About You", 10.53);
        album.addSong("You Say You Care", 06.16);
        album.addSong("Theme for Ernie", 04.57);
        album.addSong("Russian Lullaby", 05.33);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You'd Be So Nice to Come Home To", playList);
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(3, playList);
        albums.get(0).addToPlaylist("The Theme", playList);
        albums.get(0).addToPlaylist("Chamber Mates", playList);
        albums.get(1).addToPlaylist("Good Bait", playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist("Theme for Ernie", playList);
        albums.get(1).addToPlaylist("Confessin", playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
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
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (!forward) {
                            if (listIterator.hasNext()) {
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We are at the end of the list");
                            }
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
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions \n" +
        "1 - play next song \n" +
        "2 - play previous song \n" +
        "3 - to replay current song \n" +
        "4 - list songs in the playlist \n" +
        "5 - print available actions \n" +
        "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
    }





}
