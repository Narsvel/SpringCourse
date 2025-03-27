package org.ost.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music{

    List<String> songList = new ArrayList<>(Arrays.asList("Mockingbird", "Superman", "Smack That"));

    @Override
    public List<String> getPlaySong() {
        return songList;
    }

}
