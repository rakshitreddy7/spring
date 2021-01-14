package com.rakshit.testing.spring.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
@Builder
@AllArgsConstructor
@Data/*@Data includes @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together*/
public class Employee {

    private Machine machine;
    private Integer eid;
    private String department;
    private String gender;

    @Autowired
    public Employee(Machine machine) {
        System.out.println("Employee object is created..");
        this.machine = machine;
    }

    public void show() {
        System.out.println("You're in Employee's show()..");
    }
}
