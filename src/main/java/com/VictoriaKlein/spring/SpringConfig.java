package com.VictoriaKlein.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.VictoriaKlein.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    ClassicalMusic classicalMusic (){
        return new ClassicalMusic();
    }
    @Bean
    PopMusic popMusic (){
        return new PopMusic();
    }
    @Bean
   List<Music> musicList (){
      return  new ArrayList<>();
    }
    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
