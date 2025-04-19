package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ExampleMyFirstService {

    private ExampleFirstClass exampleFirstClass;

    private Environment environment;

    @Autowired
    public void injectDependencies (ExampleFirstClass exampleFirstClass){
        this.exampleFirstClass = exampleFirstClass;

    }

    public String sagstHallo(){
        return exampleFirstClass.hallo();

    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

    public String getOsName(){
        return environment.getProperty("os.name");
    }

    public String readPersonalProperty(){
        return environment.getProperty("personal.property");
    }

}
