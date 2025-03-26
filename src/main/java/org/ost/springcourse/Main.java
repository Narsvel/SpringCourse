package org.ost.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("musicRockBean", RockMusic.class);
        System.out.println(rockMusic.getPlaySong());
        RockMusic secondRockMusic = context.getBean("musicRockBean", RockMusic.class);
        System.out.println(rockMusic == secondRockMusic);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(firstMusicPlayer == secondMusicPlayer); //true т.к. по default используется scope паттерн singleton
//
//        firstMusicPlayer.playMusic();
//
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();

    }

}
