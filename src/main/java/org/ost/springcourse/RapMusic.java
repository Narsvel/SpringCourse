package org.ost.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{

    @Override
    public String getPlaySong() {
        return "Mockingbird";
    }

}
