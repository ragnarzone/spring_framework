package org.chernyshov.spring.genres;

import org.chernyshov.spring.Music;

public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Take five";
    }
}
