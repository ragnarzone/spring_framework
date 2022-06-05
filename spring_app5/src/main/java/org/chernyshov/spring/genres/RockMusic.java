package org.chernyshov.spring.genres;

import org.chernyshov.spring.Music;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
