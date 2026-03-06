package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome To Github action :";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
