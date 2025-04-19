package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleApplicationConfig {

    @Bean
    public ExampleFirstClass exampleFirstClass(){
        return new ExampleFirstClass("Bean 1: Ich bin ein SoftwareEntwickler");
    }

    @Bean
    @Qualifier
    public ExampleFirstClass exampleFirstClass2(){
        return new ExampleFirstClass("Bean 2: Ich bin ein SoftwareEntwickler");
    }
}
