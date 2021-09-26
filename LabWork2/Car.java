package com.example.labwork1;

import org.springframework.stereotype.Component;

@Component("carBean")
public class Car
{
    public void StartEngine()
    {
        System.out.println("Завели машину");
    }

    public void StopEngine()
    {
        System.out.println("Глушим мотор");
    }

    public void init()
    {
        System.out.println("Class Car: init method!");
    }

    public void destroy()
    {
        System.out.println("Class Car: destroy method!");
    }
}
