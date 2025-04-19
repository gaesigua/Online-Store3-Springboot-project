package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(ExampleApplication.class, args);
        ExampleMyFirstService exampleMyFirstService= context.getBean(ExampleMyFirstService.class);

        System.out.println("Bean Injection: " + exampleMyFirstService.sagstHallo());
        System.out.println("Java Version: " + exampleMyFirstService.getJavaVersion());
        System.out.println("Os Name: " + exampleMyFirstService.getOsName());
        System.out.println("Personal property: " + exampleMyFirstService.readPersonalProperty());
    }
}
