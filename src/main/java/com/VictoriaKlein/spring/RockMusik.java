package com.VictoriaKlein.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusik implements Music{
    MusicGenres musicGenre=MusicGenres.ROCK;
    @Override
    public String getSong(int i) {
        List<String> songs = new ArrayList<>();
        songs.add("I just wanna lovin' you baby");
        songs.add("smoke on the water");
        songs.add("rockstar");
        System.out.println(songs.get(i));
        return songs.get(i);
    }
    public MusicGenres getMusicGenres(){
        return musicGenre;
    }
}
