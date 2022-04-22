package com.trackenshure;

import com.trackenshure.config.AppConfig;
import com.trackenshure.model.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Object musicBean_classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //musicPlayer.playMusic();

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        RockMusic musicBean1 = context.getBean("musicBean1", RockMusic.class);
//        musicBean1.setName("Wind cries Mary !!!!!!!!!!!!!!");
//        MusicPlayer secondMusicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        System.out.println();
//        secondMusicPlayer2.playMusic();
//
//        System.out.println();
//        boolean comparing = firstMusicPlayer == secondMusicPlayer2;
//        System.out.println(comparing);
//
//        context.close();
//
//        // ApplicationContext
//        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService userService = context1.getBean(UserService.class);
//
//        // AddUsers
//        userService.add(new Movie("John", "Wick", "john.wick@example.com"));
//        userService.add(new Movie("Jason", "Statham", "jason.stathem@example.com"));
//        userService.add(new Movie("Chuck", "Norris", "chuck.norris@example.com"));
//        userService.add(new Movie("Bruce", "Willis", "bruce.willis@example.com"));

        // Get Users
//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("First Name = " + user.getFirstName());
//            System.out.println("Last Name = " + user.getLastName());
//            System.out.println("Emal = " + user.getEmail());
//            System.out.println();
//        }


    }
}