package com.microservice.eurreka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurrekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurrekaApplication.class, args);
    }

}
