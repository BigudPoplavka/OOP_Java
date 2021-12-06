package com.example.labwork3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LabWork3Application
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

       // Warehouse warehouse = context.getBean("WarehouseBean", Warehouse.class);
        Warehouse warehouse = new Warehouse();

        Thing setOfDishes = new EasilyBreakableThing("Dishes", 5, 2);
        Thing aquarium = new GlassThing("Middle cube aquarium", 3, true);
        Thing aerozole = new FlammableThing("Aerozole 2000", 0.5f, 200);

        warehouse.AddThing(setOfDishes);
        warehouse.AddThing(aquarium);
        warehouse.AddThing(aerozole);

        warehouse.TestAspect();

        context.close();
    }
}
