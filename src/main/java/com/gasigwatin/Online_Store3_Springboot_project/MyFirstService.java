package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MeineErsteSchule1 meineErsteSchule;

    public String introduztion(){

        return "My introduction(Dependency) is saying: " + meineErsteSchule.sichVorstellen();

    }
}
