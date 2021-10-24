package com.generation.didi;

public class ConductorDidiSpecial extends DidiDriver{
    public ConductorDidiSpecial(String name, String carModel, String plate) {
        super(name,carModel,plate);
        setMinimum(10);
        setRatePerKm(3);
        setRatePerMinute(2);
    }
}
