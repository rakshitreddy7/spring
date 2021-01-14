package com.rakshit.testing.spring.models;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public String characteristics() {
        return "Bark";
    }
}
