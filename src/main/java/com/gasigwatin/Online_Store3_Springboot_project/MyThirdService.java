package com.gasigwatin.Online_Store3_Springboot_project;


//3. METHOD INJECTION

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyThirdService {

    private MeineErsteSchule1 meineErsteSchule1;

    @Autowired
    public void injectBeans(
            @Qualifier("bean2")
            MeineErsteSchule1 meineErsteSchule1) {
        this.meineErsteSchule1 = meineErsteSchule1;
    }

    public String introduztion(){
        return "My introduction (Dependency) using METHOD INJECTION: " + meineErsteSchule1.sichVorstellen();
    }

}
