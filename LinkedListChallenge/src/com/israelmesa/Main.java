package com.israelmesa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Song coldFacts = new Song("Ka", "Cold Facts", 4.07);
        Album ironWorks = new Album("Iron Works",new ArrayList<Song>());
        ironWorks.addSongToAlbum(coldFacts);
        ironWorks.displayAlbum();
    }
}
