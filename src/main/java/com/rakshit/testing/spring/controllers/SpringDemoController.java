package com.rakshit.testing.spring.controllers;

import com.rakshit.testing.spring.models.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*@RestController -> @Controller + @ResponseBody*/
@RequestMapping(value = "/test")
public class SpringDemoController {

    private final Animal animal;

    public SpringDemoController(@Qualifier(value = "dog") Animal animal) {
        this.animal = animal;
    }

    @GetMapping
    public String fetchDogCharacteristics() {
        return animal.characteristics();
    }
}
