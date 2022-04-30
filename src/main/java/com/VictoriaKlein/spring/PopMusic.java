package com.VictoriaKlein.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class PopMusic implements Music{
    MusicGenres musicGenre = MusicGenres.POP;
    @Override
    public String getSong(int i) {
        List<String> songs = new ArrayList<>();
        songs.add("lalala");
        songs.add("girl");
        songs.add("hey man");
        System.out.println(songs.get(i));
        return songs.get(i);
    }
    public MusicGenres getMusicGenres(){
return musicGenre;
    }
}
