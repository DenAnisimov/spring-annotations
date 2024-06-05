package org.example.springannotations.player;

import org.example.springannotations.music.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void play(MusicGenre musicGenre) {
        List<String> songs = new ArrayList<>();
        for (Music music : musicList) {
            if (musicGenre == MusicGenre.ROCK) {
                if (music instanceof RockMusic) {
                    songs.addAll(music.getSong());
                }
            }
            if (musicGenre == MusicGenre.RAP) {
                if (music instanceof RapMusic) {
                    songs.addAll(music.getSong());
                }
            }
            if (musicGenre == MusicGenre.CLASSICAL) {
                if (music instanceof ClassicalMusic) {
                    songs.addAll(music.getSong());
                }
            }
        }

        int musicIndex = new Random().nextInt(0, songs.size());
        String song = songs.get(musicIndex);
        System.out.println(song);
    }
}
