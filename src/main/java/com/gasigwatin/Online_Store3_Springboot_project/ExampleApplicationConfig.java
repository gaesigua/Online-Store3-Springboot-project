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
    public ExampleFirstClass exampleFirstClass2(){
        return new ExampleFirstClass("Bean 2: ");
    }

    @Bean

    public ExampleFirstClass exampleFirstClass3(){
        return new ExampleFirstClass("Bean 3: ");
    }

    @Bean
    @Qualifier
    public ExampleMySecondClass exampleMySecondClass(){
        return new ExampleMySecondClass();
    }
}
