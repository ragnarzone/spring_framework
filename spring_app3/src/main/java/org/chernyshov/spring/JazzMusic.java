package org.chernyshov.spring;

import org.springframework.stereotype.Component;


public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "So What";
    }
}
