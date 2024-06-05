package org.example.springannotations.player;

import org.example.springannotations.music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RapMusicPlayer {
    private Music music;

    @Autowired
    public RapMusicPlayer(@Qualifier("rapMusic") Music music) {
        this.music = music;
    }

    public void play() {
        int musicIndex = new Random().nextInt(0, music.getSong().size());
        String rapMusic = music.getSong().get(musicIndex);
        System.out.println(rapMusic);
    }
}
