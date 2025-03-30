package org.ost.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("org.ost.springcourse") //сканирует компоненты @Component в репозитории
@PropertySource("classpath:musicPlayer.properties") //добавляем файл с данными musicPlayer.properties
public class SpringConfig { //java class заменяет applicationContext.xml

    @Bean
    public ArrayList<Music> arrayListBean(@Qualifier("classicMusic") Music classic,
                                          @Qualifier("rockMusic") Music rock,
                                          @Qualifier("rapMusic") Music rap) {
        return new ArrayList<>(Arrays.asList(classic, rock, rap));
    }

}
