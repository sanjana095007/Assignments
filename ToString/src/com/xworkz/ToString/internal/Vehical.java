package com.xworkz.ToString.internal;

public class Vehical{
    private String type;
    private int speed;
    private String fuelType;

    public Vehical(String type, int speed, String fuelType) {
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehical: Type : " + type + ", Speed = " + speed + " km/h, Fuel = " + fuelType;
    }
}

