package com.andrei.spring.rest.template.microservicestask4;

import com.andrei.spring.rest.template.microservicestask4.services.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MicroservicesTask4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MicroservicesTask4Application.class, args);
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);

        System.out.println(userService.getAllUsers());
        System.out.println("FinalCode: " + userService.getAnswer());

    }
}
