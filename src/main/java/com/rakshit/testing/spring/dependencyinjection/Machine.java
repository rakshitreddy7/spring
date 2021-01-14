package com.rakshit.testing.spring.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@AllArgsConstructor
public class Machine {

    public Machine() {
        System.out.println("Machine object is created..");
    }

    private int cores;
    private String name;
    private String processor;

    public void show() {
        System.out.println("You're in Machine's show()..");
    }
}
