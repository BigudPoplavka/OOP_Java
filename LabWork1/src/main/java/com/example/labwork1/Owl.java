package com.example.labwork1;

public class Owl implements Pet{
    public String name = "Сова";
    @Override
    public String Say(){
        return "*Звуки удивленной совы*";
    }
}
