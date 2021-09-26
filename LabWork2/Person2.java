package com.example.labwork1;

public class Person2 {
    private Pet pet;
    private int age;
    private String name;

    public Person2(Pet _pet){
        System.out.println("Person was created!");
        this.pet = _pet;
    }

    public String CallYourPet()
    {
        return String.format(" - Эй, ко мне! \n - %s", pet.Say());
    }
}
