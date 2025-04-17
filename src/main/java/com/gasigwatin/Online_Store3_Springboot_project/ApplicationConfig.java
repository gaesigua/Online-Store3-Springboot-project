package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

//    @Bean
//    public MeineErsteSchule3 meineErsteSchule3() {
//        return new MeineErsteSchule3();
//    }

    //Let's create a bean of Type (that returns) MeineErsteSchule4

//    @Bean("my4thGreeting")
//    public MeineErsteSchule4 meineErsteSchule4() {
//        return new MeineErsteSchule4();
//    }

    //Let's create a bean of type MeineErsteSchule1 with a name of meineErsteSchule1

    @Bean
    //@Qualifier("bean1")
    public MeineErsteSchule1 meineErsteSchule1() {
        return new MeineErsteSchule1("Kanamugire");
    }

    //Let's create a second bean of type MeineErsteSchule1 (but with a different method name)

    @Bean
    @Qualifier("bean2")
    public MeineErsteSchule1 mySecondErsteSchule1Bean(){
        return new MeineErsteSchule1("Gaesigua");
    }

    //Let's create a third bean of type MeineErsteSchule1 (but with a different method name)

    @Bean
    //@Qualifier("bean3")
    @Primary
    public MeineErsteSchule1 myThirdErsteSchule1Bean() {
        return new MeineErsteSchule1("Kanyana");
    }
}
