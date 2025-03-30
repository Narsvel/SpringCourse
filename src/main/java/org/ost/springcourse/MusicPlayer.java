package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype") //указываем scope(паттерн создания bean) с помощью аннотации
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String playerName;
    @Value("${musicPlayer.volume}")
    private Integer playerVolume;

    private List<Music> list;

    @Autowired
    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void playMusic() {
        int randomNumber = new Random().nextInt(3);
        System.out.println("Playing: " + list.get(randomNumber).getPlaySong());
    }

    public String toMusic() {
        StringBuilder songs = new StringBuilder("Playing: ");
        for (Music music : list) {
            songs.append(music.getPlaySong()).append(" ");
        }
        return songs.toString();
    }

    public String getPlayerName() {
        return playerName;
    }

    public Integer getPlayerVolume() {
        return playerVolume;
    }

//    @PostConstruct //для работы аннотации необходимо добавить dependency в pom.xml javax.annotation-api
//    //@PostConstruct используется для конкретной initialization объекта MusicPlayer
//    private void myInitMethod() {
//        System.out.println("Some initialization operations");
//    }
//
//    @PreDestroy //для работы аннотации необходимо добавить dependency в pom.xml javax.annotation-api
//    //@PreDestroy используется для конкретного destroy объекта MusicPlayer, не работает с scope prototype
//    private void myDestroyMethod() {
//        System.out.println("Some destroy operations");
//    }

}
