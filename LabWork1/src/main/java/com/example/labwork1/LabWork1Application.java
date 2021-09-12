package com.example.labwork1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@RestController
public class LabWork1Application {
    public static void main(String[] args) {
        SpringApplication.run(LabWork1Application.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        System.out.println(person.CallYourPet());
    }

    @GetMapping("/hello")
    public String SayHello(@RequestParam(value = "MyName", defaultValue = "World") String name){
        return String.format("Hello, %s", name);
    }

    @GetMapping("/about_us")
    public String GetAboutUsInfo(){
        return "About us";
    }

    @GetMapping("/options")
    public String GetOptions(@RequestParam(value = "Option", defaultValue = "Option") String option){
        if(option != null)
            return "Not an option";
        return "Option";
    }
}
