package org.chernyshov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Instance initialization block
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
