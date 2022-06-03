package org.chernyshov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> songs = new ArrayList<>();

    // Instance initialization block
    {
        songs.add("Wind cries Mary");
        songs.add("Paint in black");
        songs.add("Can't seem to make you mine");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
