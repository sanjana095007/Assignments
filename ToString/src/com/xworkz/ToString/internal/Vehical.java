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
        return "Vehical: Type : " + type + ", Speed = " + speed + " Fuel = " + fuelType;
    }
    @Override
    public int hashCode() {
        return 193;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Vehical) {
                System.out.println("Reference of Vehical will be compared");
                Vehical vehical = this;
                Vehical vehical1 = (Vehical) obj;
                if (vehical.type.equals(vehical1.type)) {
                    System.out.println("Both vehicles are same");
                    return true;
                }
            }
        }
        return false;
    }

}

