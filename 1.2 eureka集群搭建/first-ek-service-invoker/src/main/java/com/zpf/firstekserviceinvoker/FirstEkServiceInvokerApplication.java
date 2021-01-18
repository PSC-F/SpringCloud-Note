package com.zpf.firstekserviceinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstEkServiceInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstEkServiceInvokerApplication.class, args);
    }

}
