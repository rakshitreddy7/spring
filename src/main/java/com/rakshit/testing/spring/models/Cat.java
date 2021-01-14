package com.rakshit.testing.spring.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Cat implements Animal {
    @Override
    public String characteristics() {
        return "Meow";
    }
}
