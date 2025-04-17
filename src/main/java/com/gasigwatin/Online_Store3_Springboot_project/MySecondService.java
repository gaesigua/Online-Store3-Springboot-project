package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//2. FIELD INJECTION

@Service
public class MySecondService {

    @Autowired
    private MeineErsteSchule1 meineErsteSchule1;


    public String introduztion(){
        return "My introduction (Dependency) using FIELD INJECTION is saying: " + meineErsteSchule1.sichVorstellen();
    }
}
