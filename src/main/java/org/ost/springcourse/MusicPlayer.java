package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

//    @Autowired
//    @Qualifier("classicMusic") //указываем какой bean надо внедрять в Music firstMusic
    private Music firstMusic;  //через рефлексию spring может использовать @Autowired даже на приватном поле
//    @Autowired
//    @Qualifier("rockMusic")
    private Music secondMusic;

    @Autowired //в кострукторе @Qualifier указывается в скобках
    public MusicPlayer(@Qualifier("classicMusic") Music firstMusic,
                       @Qualifier("rockMusic") Music secondMusic) {
        this.firstMusic = firstMusic;
        this.secondMusic = secondMusic;
    }

//    @Autowired
//    @Qualifier("classicMusic")
//    public void setFirstMusic(Music firstMusic) {
//        this.firstMusic = firstMusic;
//    }
//    @Autowired
//    @Qualifier("rockMusic")
//    public void setSecondMusic(Music secondMusic) {
//        this.secondMusic = secondMusic;
//    }

    public void playMusic() {
        System.out.println("Playing: " + firstMusic.getPlaySong());
        System.out.println("Playing: " + secondMusic.getPlaySong());
    }

    public String toMusic() {
        return "Playing: " + firstMusic.getPlaySong() + " and " + secondMusic.getPlaySong();
    }


}
