package com.example.labwork3;

public class EasilyBreakableThing extends Thing{
    private int _endurance;

    public EasilyBreakableThing(String thing_name, float thing_weight, int endurance)
    {
        this._name = thing_name;
        this._weight = thing_weight;
        this._endurance = endurance;

        System.out.println("WARNING! This is easily breakable thing!");
    }
}
