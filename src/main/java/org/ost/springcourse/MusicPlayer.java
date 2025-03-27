package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype") //указываем scope(паттерн создания bean) с помощью аннотации
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String playerName;
    @Value("${musicPlayer.volume}")
    private Integer playerVolume;

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

    public String getPlayerName() {
        return playerName;
    }

    public Integer getPlayerVolume() {
        return playerVolume;
    }

    @PostConstruct //для работы аннотации необходимо добавить dependency в pom.xml javax.annotation-api
    //@PostConstruct используется для конкретной initialization объекта MusicPlayer
    private void myInitMethod() {
        System.out.println("Some initialization operations");
    }

    @PreDestroy //для работы аннотации необходимо добавить dependency в pom.xml javax.annotation-api
    //@PreDestroy используется для конкретного destroy объекта MusicPlayer, не работает с scope prototype
    private void myDestroyMethod() {
        System.out.println("Some destroy operations");
    }

}
