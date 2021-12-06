package com.example.labwork3;

import java.util.ArrayList;
import java.util.Optional;

public class Warehouse
{
    ArrayList<Thing> thingsList = new ArrayList<Thing>();

    public void AddThing(Thing thing)
    {
        thingsList.add(thing);
        System.out.println("CONFIRMED! Thing " + thing._name + " correctly added!");
    }

    public Optional<Thing> GetThing(String name, int count)
    {
        for (int i = 0; i < count; i++)
            return thingsList.stream().filter(x -> x._name == name).findFirst();
        return null;
    }
    public void TestAspect()
    {
        System.out.println("Aspect");
    }
}
