package com.israelmesa;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getSongTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }


}

