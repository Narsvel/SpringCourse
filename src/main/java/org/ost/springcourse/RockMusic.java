package org.ost.springcourse;

public class RockMusic implements Music{

    private RockMusic(){}

    public static RockMusic factoryMethodRockMusic() {
        return new RockMusic();
    }

    @Override
    public String getPlaySong() {
        return "Thunderstruck";
    }
    public void doMyInitialization() {
        System.out.println("Some my Initialization");
    }
    public void doMyDestruction() {
        System.out.println("Some my Destruction");
    }
}
