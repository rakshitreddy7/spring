package com.rakshit.testing.spring.controllers;

import com.rakshit.testing.spring.models.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*@RestController -> @Controller + @ResponseBody*/
@RequestMapping(value = "/test")
public class SpringDemoController {

    /*
    * 1. Major difference between a constructor injection & setter injection is that, constructor injection are mandatory injections (meaning @Autowired(required=false) does not have any impact & you get an error.
    *    Whereas setter injections are not mandatory.
    * 2. You can also use @Primary on the service class (either Dog or Cat which implements Animal interface) indicating the prioritized ones.
    * 3. Interesting point to note is that, @Qualifier has more preference compared to @Primary.
    * */

    private final Animal animal;

    public SpringDemoController(@Qualifier(value = "dog") Animal animal) {
        this.animal = animal;
    }

    @GetMapping
    public String fetchDogCharacteristics() {
        return animal.characteristics();
    }
}
