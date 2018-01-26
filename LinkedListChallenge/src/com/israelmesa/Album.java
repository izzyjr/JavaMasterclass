package com.israelmesa;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> albumSongs;

    public Album(String name, ArrayList<Song> albumSongs) {
        this.albumName = albumName;
        this.albumSongs = new ArrayList<Song>();
    }

    public void addSongToAlbum(Song song) {
        this.albumSongs.add(song);
    }

    public void displayAlbum() {
        System.out.println("Album name: " + this.albumName);
        for (int i = 0; i < this.albumSongs.size(); i++) {
            System.out.println((i + 1) + ": " + this.albumSongs.get(i));
        }
    }

    public void removeSong(int position) {
        this.albumSongs.remove(position);
    }
}

