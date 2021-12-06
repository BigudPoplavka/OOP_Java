package com.example.labwork3;

public abstract class Thing implements IThing{
    protected String _name;
    protected float _weight;

    public float get_weight() {
        return _weight;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        if(name == null || name == "")
            throw new Error("ERROR! Empty name!");
        else
            this._name = name;
    }

    public void set_weight(float weight) {
        if(weight <= 0)
            throw new Error("ERROR! Zero or negative weight!");
        else
            this._weight = weight;
    }

    @Override
    public void AddThing(Warehouse warehouse) {
        warehouse.AddThing(this);
    }
}
