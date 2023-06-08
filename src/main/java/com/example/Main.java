package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//makes it a spring boot application
@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        // calls the spring boot application 
        SpringApplication.run(Main.class, args);

        // System.out.println("Hello");
        
    }
}
