package com.VictoriaKlein.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{
    MusicGenres musicGenre = MusicGenres.CLASSICAL;
    @Override
    public String getSong(int i) {
        List<String> songs = new ArrayList<>();
        songs.add("bach");
        songs.add("beethoven");
        songs.add("glinka");
        System.out.println(songs.get(i));
        return songs.get(i);
    }


    public MusicGenres getMusicGenres(){
        return musicGenre;
    }
}
