package com.epam.learn.javaactionstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaActionsTestApplication {

    static void main(String[] args) {
        SpringApplication.run(JavaActionsTestApplication.class, args);
    }

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
