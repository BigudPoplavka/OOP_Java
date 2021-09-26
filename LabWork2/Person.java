package com.example.labwork1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("personBean")
public class Person
{
    private Pet pet;
    private Car car;
    @Value("${person.age}")
    public int age;  @Value("${person.name}")

    public String name;

    @Autowired
    public Person(@Qualifier("owlBean") Pet pet, Car car)
    {
        this.pet = pet;
        this.car = car;
    }

    public void setAge(int _age){
        this.age = _age;
    }

    public void setName(String _name)
    {
        this.name = _name;
    }

    public String CallYourPet()
    {
        return String.format(" - Эй, ко мне! \n - %s", pet.Say());
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Class Person: init method!");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Class Person: destroy method!");
    }
}
