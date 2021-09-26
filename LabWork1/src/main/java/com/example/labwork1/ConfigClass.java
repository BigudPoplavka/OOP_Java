package com.example.labwork1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("com.example.labwork1")
public class ConfigClass {
    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person2 person2Bean(){
        return new Person2(catBean());
    }
}
