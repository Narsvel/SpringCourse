package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

//    private Music music;
//
//    @Autowired
//    public MusicPlayer(Music music) { //будет ошибка т.к. несколько бинов подходит для Music (ClassicalMusic, RockMusic, RapMusic)
//        this.music = music;
//    }

    private ClassicMusic classicMusic;  //через рефлексию spring может использовать @Autowired даже на приватном поле
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

//    @Autowired
//    public void setClassicMusic(ClassicMusic classicMusic) {
//        this.classicMusic = classicMusic;
//    }

    public void playMusic() {
        System.out.println("Playing: " + classicMusic.getPlaySong());
        System.out.println("Playing: " + rockMusic.getPlaySong());
    }

    public String toMusic() {
        return "Playing: " + classicMusic.getPlaySong() + " and " + rockMusic.getPlaySong();
    }


}
