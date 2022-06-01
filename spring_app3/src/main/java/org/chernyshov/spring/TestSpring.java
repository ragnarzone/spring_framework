package org.chernyshov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);

        musicPlayer.playMusic();

        context.close();
    }
}
