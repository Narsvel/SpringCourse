package org.ost.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicMusic implements Music{

    List<String> songList = new ArrayList<>(Arrays.asList("Nutcracker", "In the Hall of the Mountain King", "Moonlight Sonata"));

    @Override
    public List<String> getPlaySong() {
        return songList;
    }

}
