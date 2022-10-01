package com.cloud.cloud01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cloud01Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloud01Application.class, args);
    }

}
