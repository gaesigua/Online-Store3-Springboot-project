package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

//    @Bean
//    public MeineErsteSchule3 meineErsteSchule3() {
//        return new MeineErsteSchule3();
//    }

    @Bean("my4thGreeting")
    public MeineErsteSchule4 meineErsteSchule4() {
        return new MeineErsteSchule4();
    }
}
