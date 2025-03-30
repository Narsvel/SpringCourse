package org.ost.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    @Override
    public String getPlaySong() {
        return "Thunderstruck";
    }

}
