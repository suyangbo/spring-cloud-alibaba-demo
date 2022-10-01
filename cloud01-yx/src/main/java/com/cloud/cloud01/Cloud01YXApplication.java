package com.cloud.cloud01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class Cloud01YXApplication {
    public static void main(String[] args) {
        SpringApplication.run(Cloud01YXApplication.class,args);
    }
}
