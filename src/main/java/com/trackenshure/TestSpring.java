package com.trackenshure;

import com.trackenshure.model.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();


        context.close();
    }
}