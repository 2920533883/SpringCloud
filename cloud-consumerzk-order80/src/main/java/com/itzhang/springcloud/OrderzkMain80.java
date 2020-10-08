package com.itzhang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderzkMain80.class, args);
    }
}
