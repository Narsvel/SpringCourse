package org.ost.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.ost.springcourse") //сканирует компоненты @Component в репозитории
@PropertySource("classpath:musicPlayer.properties") //добавляем файл с данными musicPlayer.properties
public class SpringConfig { //java class заменяет applicationContext.xml

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public ArrayList<Music> arrayListBean() {
        return new ArrayList<>(Arrays.asList(classicMusic(), rockMusic(), rapMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(arrayListBean());
        //можно и return new MusicPlayer(Arrays.asList(classicMusic(), rockMusic(), rapMusic()));
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
