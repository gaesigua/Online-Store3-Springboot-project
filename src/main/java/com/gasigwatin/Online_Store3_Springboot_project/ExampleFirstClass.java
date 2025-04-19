package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public class ExampleFirstClass {

    private String meinVar;

    public ExampleFirstClass(String meinVar) {
        this.meinVar = meinVar;
    }

    public String hallo(){
        return "Hallo alles! Ich heisse Tin. " + meinVar;
    }

    public String history(){
        return "A long time ago in a very far land, ..";
    }

}
