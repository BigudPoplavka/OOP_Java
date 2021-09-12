package com.example.labwork1;

public class Person {
    private Pet pet;
    private Car car;
    public int age;
    public String name;

    public Person(Pet pet, Car car, int age, String name){
        this.pet = pet;
        this.car = car;
        this.age = age;
        this.name = name;
    }

    public String CallYourPet(){
        String petVoice = pet.Say();
        return String.format(" - Эй, ко мне! \n - %s", pet.Say());
    }
}
