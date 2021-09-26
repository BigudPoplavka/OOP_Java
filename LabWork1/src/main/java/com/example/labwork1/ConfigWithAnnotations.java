package com.example.labwork1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void Main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Owl myOwl = context.getBean("owlBean", Owl.class);

        myOwl.Say();

        context.close();
    }
}
