package com.springbootms.springbootms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootmsApplication {
.jar
    @RequestMapping("/api/vi/Hello")
    public String home() {
        return "This is my first push to Github repository";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmsApplication.class, args);
    }
}

