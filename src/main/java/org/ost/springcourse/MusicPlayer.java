package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

//    @Autowired
//    @Qualifier("classicMusic") //указываем какой bean надо внедрять в Music firstMusic
    private Music firstMusic;  //через рефлексию spring может использовать @Autowired даже на приватном поле
//    @Autowired
//    @Qualifier("rockMusic")
    private Music secondMusic;
    private Music thirdMusic;

    @Autowired //в кострукторе @Qualifier указывается в скобках
    public MusicPlayer(@Qualifier("classicMusic") Music firstMusic,
                       @Qualifier("rockMusic") Music secondMusic,
                       @Qualifier("rapMusic") Music thirdMusic) {
        this.firstMusic = firstMusic;
        this.secondMusic = secondMusic;
        this.thirdMusic = thirdMusic;
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

    public void playMusic(MusicalGenre musicalGenre) {
        int randomNumber = new Random().nextInt(3);
        switch (musicalGenre) {
            case CLASSIC:
                System.out.println(firstMusic.getPlaySong().get(randomNumber));
                break;
            case ROCK:
                System.out.println(secondMusic.getPlaySong().get(randomNumber));
                break;
            case RAP:
                System.out.println(thirdMusic.getPlaySong().get(randomNumber));
        }
    }

    public String toMusic() {
        return "Playing: " + firstMusic.getPlaySong() + " and " + secondMusic.getPlaySong() +
                " and " + thirdMusic.getPlaySong();
    }


}
