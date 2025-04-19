package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources(
        {@PropertySource("classpath:customizedfile1.properties"),
        @PropertySource("classpath:customizedfile2.properties")}
)
public class ExampleMySecondService {


    private final ExampleMySecondClass exampleMySecondClass;

    @Value("${my.own.property}")
    private String customizedProperty1FromAnotherFile;


    @Value("${my.second.own.property}")
    private String customizedProperty2FromAnotherFile;

    @Value("${my.second.own.property.int}")
    private Integer customizedProperty3FromAnotherFile;


    public ExampleMySecondService(ExampleMySecondClass exampleMySecondClass) {
        this.exampleMySecondClass = exampleMySecondClass;
    }


    public String tellASecondStory(){
        return "A second story" + exampleMySecondClass.tellASecondStory();
    }

    public String getCustomizedProperty1FromAnotherFile() {
        return customizedProperty1FromAnotherFile;
    }

    public String getCustomizedProperty2FromAnotherFile() {
        return customizedProperty2FromAnotherFile;
    }

    public Integer getCustomizedProperty3FromAnotherFile() {
        return customizedProperty3FromAnotherFile;
    }

}
