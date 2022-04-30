package com.VictoriaKlein.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String songName;
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
@Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer (List <Music> musicList) {
        this.musicList = musicList;
    }


    public List<Music> getMusicList() {
        return musicList;
    }
//@Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(MusicGenres musicGenre){
        Random random = new Random();
        int r = random.nextInt(3);
        for (Music direction : musicList) {
            if (direction.getMusicGenres() == musicGenre) direction.getSong(r);
        }
//        for (int i=0; i< musicList.size(); i++) {
//          musicList.get(r).getSong(r);
//            System.out.println("from genre " + musicList.get(r).getMusicGenres());
//        }
    }

}
