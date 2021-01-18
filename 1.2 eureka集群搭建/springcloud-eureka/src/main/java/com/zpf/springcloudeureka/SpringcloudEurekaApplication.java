package com.zpf.springcloudeureka;

import freemarker.cache.FirstMatchTemplateConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;


@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaApplication {

    public static void main(String[] args) {
        //读取控制台,决定使用profile
        Scanner scanner = new Scanner(System.in);
        String profiles = scanner.nextLine();
        new SpringApplicationBuilder(SpringcloudEurekaApplication.class)
                .profiles(profiles).run(args);
    }


}
