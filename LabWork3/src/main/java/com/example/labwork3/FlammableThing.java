package com.example.labwork3;

public class FlammableThing extends Thing{
    private int _burnTemperature;

    public int get_burnTemperature() {
        return _burnTemperature;
    }

    public void set_burnTemperature(int burnTemperature) {
        this._burnTemperature = burnTemperature;
    }

    public FlammableThing(String thing_name, float thing_weight, int burnTemperature)
    {
        this._name = thing_name;
        this._weight = thing_weight;
        this._burnTemperature = burnTemperature;

        System.out.println("WARNING! This is easily flammable thing!");
    }
}
