package com.xworkz.ToString.internal;

public class Barber {
    private String name;
    private int experience;
    private String shopName;

    public Barber(String name, int experience, String shopName) {
        this.name = name;
        this.experience = experience;
        this.shopName = shopName;
    }

    public String toString() {
        return "Barber: " + name + ", Experience: " + experience + " years, Shop: " + shopName;
    }
    @Override
    public int hashCode() {
        return 107;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Barber) {
                System.out.println("Reference of Barber will be compared");
                Barber barber = this;
                Barber barber1 = (Barber) obj;
                if (barber.name.equals(barber1.name) && barber.experience == barber1.experience && barber.shopName.equals(barber1.shopName)) {
                    System.out.println("Both barbers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

