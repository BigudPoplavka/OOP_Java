package com.example.labwork1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LabWork2Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Pet pet = context.getBean("catBean", Cat.class);
        pet.Say();

        Person2 person2 = context.getBean("person2Bean", Person2.class);
        person2.CallYourPet();

        context.close();
    }
}
