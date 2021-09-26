package com.example.labwork1;

import org.springframework.stereotype.Component;

@Component("petBean")
public interface Pet {
    public String Say();
    void init();
    void destroy();
}
