package com.rakshit.testing.spring;

import com.rakshit.testing.spring.dependencyinjection.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		/*
		* 1. If we use bean scope as "prototype", employee bean won't be created by spring unless we call getBean().
		* 2. If we use bean scope as "singleton" (default value), employee bean will be created automatically once by spring and reuses it.
		* 3. Interesting thing to note here is that even when I use the scope as "prototype" for Machine class, no matter what the scope I use for Employee only 1 Machine bean is created.
		* 4. Only when I call getBean for Machine class, prototype will be in effect.
		* */
		Employee employee1 = context.getBean(Employee.class);
		employee1.show();

		Employee employee2 = context.getBean(Employee.class);
		employee2.show();
	}

}
