package com.master4uall.spring.social.twitter.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.master4uall.spring.social.twitter")
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}