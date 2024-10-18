package com.example.springboottutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    private final Computer dellLaptop;


    public Dev(@Qualifier("desktop") Computer dellLaptop) {
        this.dellLaptop = dellLaptop;
    }

    public void show() {
        System.out.println("Building something stupid");
        dellLaptop.compile();
    }
}
