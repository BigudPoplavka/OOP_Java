package com.example.labwork3;

public class GlassThing extends Thing{
    private boolean _isHardened;

    public boolean getHardened()
    {
        return _isHardened;
    }

    public void set_isHardened(boolean _isHardened) {
        this._isHardened = _isHardened;
    }

    public GlassThing(String thing_name, float thing_weight, boolean isHardened)
    {
        this._name = thing_name;
        this._weight = thing_weight;
        this._isHardened = isHardened;

        System.out.println("WARNING! This is glass here!");
    }
}
