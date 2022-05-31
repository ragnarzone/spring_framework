package org.chernyshov.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //create field which stores music list
    private List<Music> musicList = new ArrayList<>();

    // initialize music list from spring through getter
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // create local fields of class
    private String name;
    private int volume;

    // add getters and setters for volume and name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // declare and set method to play music for list of music
    public void playMusicList(){
        for(Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
