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
        return "Welcome To Github action";
    }

  /*  echo "# github-action" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/Dev8502/github-action.git
    git push -u origin main*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
