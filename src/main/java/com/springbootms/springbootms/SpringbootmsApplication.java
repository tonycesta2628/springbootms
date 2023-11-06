package com.springbootms.springbootms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootmsApplication {

    @RequestMapping("/api/vi/Hello")
    public String home() {
        return "Dockering using Github mvn Actions";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmsApplication.class, args);
    }
}

