package com.example.labwork1;

public class Cat implements Pet{
    @Override
    public String Say() {
        return "Nya ~ ~ :3";
    }

    @Override
    public void init() {
        System.out.println("Cat created!");
    }

    @Override
    public void destroy() {
        System.out.println("Cat dead!");
    }
}
