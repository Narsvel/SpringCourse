package org.ost.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{

    @Override
    public String getPlaySong() {
        return "Nutcracker";
    }

}
