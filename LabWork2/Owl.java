package com.example.labwork1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("owlBean")
@Scope("prototype")
public class Owl implements Pet{
    public String name = "Сова";
    @Override
    public String Say(){
        return "*Звуки удивленной совы*";
    }

    @Override
    public void init() {
        System.out.println("Interface Pet <--- Class Owl: init method!");
    }

    @Override
    public void destroy() {
        System.out.println("Interface Pet <--- Class Owl: destroy method!");
    }
}
