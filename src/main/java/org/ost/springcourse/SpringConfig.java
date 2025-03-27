package org.ost.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ost.springcourse") //сканирует компоненты @Component в репозитории
@PropertySource("classpath:musicPlayer.properties") //добавляем файл с данными musicPlayer.properties
public class SpringConfig { //java class заменяет applicationContext.xml

//    @Bean
//    public ClassicMusic classicMusic() {
//        return new ClassicMusic();
//    }
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//    @Bean
//    public RapMusic rapMusic() {
//        return new RapMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(classicMusic(), rockMusic());
//    }
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }

}
