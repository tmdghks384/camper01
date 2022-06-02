package com.example.camper01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // boot security 초기 페이지 설정
public class Camper01Application {

    public static void main(String[] args) {
        SpringApplication.run(Camper01Application.class, args);
    }

}
