package org.chernyshov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        Music rockMusic = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);
        MusicPlayer musicPlayer2 = new MusicPlayer(rockMusic);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
