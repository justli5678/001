package com.example.helloweb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.example.helloweb.controller")
public class HellowebApplication {

    public static void main(String[] args) {

        SpringApplication.run(HellowebApplication.class, args);
    }

}
