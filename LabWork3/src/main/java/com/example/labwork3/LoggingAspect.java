package com.example.labwork3;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void AddThing(Thing))")
    public void BeforeAddThingAdvice()
    {
        System.out.println("Before Advise: Попытка добавить предмет.");
    }

    @AfterReturning("execution(public void AddThing(Thing))")
    public void AfterCorrectlyExecuted()
    {
        System.out.println("Before Advise: Предмет успешно добавлен.");
    }

    @AfterThrowing("execution(void set_name(String))")
    public void AfterExceptionThrown()
    {
        System.out.println("Before Advise: Исключение брошено. ");
    }

    @Around("execution(* TestAspect())")
    public void Test()
    {
        System.out.println("Test aspect!!!!!!!");
    }

}
