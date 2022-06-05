package org.chernyshov.spring.genres;

import org.chernyshov.spring.Music;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
