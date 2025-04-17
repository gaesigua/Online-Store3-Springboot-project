package com.gasigwatin.Online_Store3_Springboot_project;

//Method 1: Using/Adding @Bean on the method in the main class

public class MeineErsteSchule1 {

    private String vorname;

    public MeineErsteSchule1(String vorname) {
        this.vorname = vorname;
    }

    public String sichVorstellen(){
        return "sich vortsellen: Hallo Alles, Ich heisse Gaesigua. My familienname ist " + vorname;
    }
}


