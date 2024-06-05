package org.example.springannotations;

import org.example.springannotations.config.SpringConfiguration;
import org.example.springannotations.music.MusicGenre;
import org.example.springannotations.player.MusicPlayer;
import org.example.springannotations.player.RockMusicPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.play(MusicGenre.RAP);
        }
    }

}
