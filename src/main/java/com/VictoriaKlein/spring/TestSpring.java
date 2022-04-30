package com.VictoriaKlein.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    //    musicPlayer.playMusic(MusicGenres.CLASSICAL);
   //     musicPlayer.playMusic(MusicGenres.ROCK);
      musicPlayer.playMusic(MusicGenres.POP);
        System.out.println( musicPlayer.getSongName() + " " +  musicPlayer.getVolume());
    //    System.out.println(musicPlayer.getMusicList().get(0).getSong(0).hashCode() + "  " + musicPlayer.getMusicList().get(0).getSong(0).hashCode());
        context.close();

    }
}
