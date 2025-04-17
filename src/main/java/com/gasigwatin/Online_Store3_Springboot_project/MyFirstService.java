package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


//1. CONSTRUCTOR INJECTION

@Service
public class MyFirstService {

    private final MeineErsteSchule1 meineErsteSchule1;

    // @Autowired (We no longer need to add the @Autowired)
    public MyFirstService(MeineErsteSchule1 meineErsteSchule1) {
        this.meineErsteSchule1 = meineErsteSchule1;
    }

    public String introduztion(){

        return "My introduction(Dependency) using CONSTRUCTOR INJECTION is saying: " + meineErsteSchule1.sichVorstellen();

    }
}
