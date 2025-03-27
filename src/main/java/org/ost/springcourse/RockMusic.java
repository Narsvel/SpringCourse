package org.ost.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    List<String> songList = new ArrayList<>(Arrays.asList("Thunderstruck", "Die, Die My Darling", "Ace Of Spades"));

    @Override
    public List<String> getPlaySong() {
        return songList;
    }

}
