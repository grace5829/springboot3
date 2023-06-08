package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//makes it a spring boot application
@SpringBootApplication

//request handling methods 
@RestController
public class Main {
    public static void main(String[] args) {
        // calls the spring boot application 
        SpringApplication.run(Main.class, args);

    }

        @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
}
