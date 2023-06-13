package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//makes it a spring boot application
//combingation of @Configuration, @EnableAutoConfiguration and @componentScan
//@Configuration- Annotating a class with the @Configuration indicates that the class 
// can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation 
// tells Spring that a method annotated with @Bean will return an object that should be registered 
// as a bean in the Spring application context.
@SpringBootApplication

// request handling methods
//all the methods in the marked class will return a JSON response
// apart of spring web MVC(model view controller)- allows us to create RESTful services easily
@RestController
public class Main {
    public static void main(String[] args) {
        // calls the spring boot application
        SpringApplication.run(Main.class, args);

    }

    //http GET request 
    @GetMapping("/greet")
    public GreetResponse greet() {
        // System.out.println("test");

        // gives JSON return with 3 keys, 3 values; 1st value is string Hello, 
        //2nd value is array with length=3 
        //3rd value is object with 2 keys 
        return new GreetResponse("Hello", List.of("Javascript", "React", "CSS"), new Person("Alex", 20));
    }

    record Person(String name, int age){}
    // makes a object with key test and value is input in function
    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person){}
}
